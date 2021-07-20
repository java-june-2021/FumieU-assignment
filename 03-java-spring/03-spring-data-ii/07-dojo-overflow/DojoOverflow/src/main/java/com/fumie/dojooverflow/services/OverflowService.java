package com.fumie.dojooverflow.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fumie.dojooverflow.models.Answer;
import com.fumie.dojooverflow.models.Question;
import com.fumie.dojooverflow.models.Tag;
import com.fumie.dojooverflow.repositories.AnswerRepository;
import com.fumie.dojooverflow.repositories.QuestionRepository;
import com.fumie.dojooverflow.repositories.TagRepository;

@Service
public class OverflowService {
	@Autowired
	private AnswerRepository aRepo;
	@Autowired
	private QuestionRepository qRepo;
	@Autowired
	private TagRepository tRepo;

	public Tag getOneTag(String subject) {
		return this.tRepo.findBySubject(subject);
	}
	
	public ArrayList<Tag> splitTags(String tags) {
		ArrayList<Tag> tagsForQ = new ArrayList<Tag>();
		String[] tagsToProcess = tags.split(",");
		for(String s : tagsToProcess) {
			if(this.tRepo.existsBySubject(s)) {
				Tag tagToAdd = this.getOneTag(s);
				tagsForQ.add(tagToAdd);
			}else {
				Tag newTag = new Tag();
				newTag.setSubject(s);
				this.tRepo.save(newTag);
				tagsForQ.add(this.getOneTag(s));
			}
		}
	    return tagsForQ;
		}
	
	public Question createQuestion(Question question) {
		question.setqTag(this.splitTags(question.getTagsFromFrontEnd()));
		return this.qRepo.save(question);
		
	}
	public Question getOneQuestion(Long id) {
	     return this.qRepo.findById(id).orElse(null);
	}
	
	public Answer createAnswer(Answer answer){
		return this.aRepo.save(answer);
	}
	
	public List<Question> getAllQuestions(){
		return this.qRepo.findAll();
	}
}
