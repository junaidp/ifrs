package com.ifrs.client.view;

import java.util.ArrayList;

import com.google.gwt.user.client.ui.Button;
import com.ifrs.shared.QuestionEntity;

import gwt.material.design.client.ui.MaterialColumn;

public class QuestionairView extends MaterialColumn {
	/*
	 * MaterialRow question1 = new MaterialRow(); MaterialRow question2 = new
	 * MaterialRow(); MaterialRow question3 = new MaterialRow(); MaterialRow
	 * question4 = new MaterialRow(); MaterialRow question5 = new MaterialRow();
	 * MaterialRow question6 = new MaterialRow(); MaterialRow question7 = new
	 * MaterialRow(); MaterialRow question8 = new MaterialRow();
	 */

	MaterialColumn c = new MaterialColumn();
	private ArrayList<QuestionEntity> questionEntity = new ArrayList<QuestionEntity>();
	// private ArrayList<QuestionEntity> questionList = new
	// ArrayList<QuestionEntity>();
	private Button btnSubmit = new Button("Submit ");

	public QuestionairView() {

		Question q1 = new Question(1,
				"Is the lease contract for short term period or the underlying asset is of low value?");
		q1.getRadioYes().setEnabled(true);
		q1.getRadioNo().setEnabled(true);
		c.add(q1);

		Question q2 = new Question(2, "Is there an identified asset?");
		q2.setEnabled(false);
		c.add(q2);

		Question q3 = new Question(3, "Does the supplier have a substantive right to substitute the asset?");
		q3.setEnabled(false);
		c.add(q3);

		Question q4 = new Question(4,
				"Does the customer have the right to obtain substantially all of the economic benefits from use of the asset throughout the period of use?");

		c.add(q4);
		q4.setEnabled(false);
		// q5 radios are different customer neither party suppliers
		Question q5 = new Question(5,
				"Does the customer, the supplier or neither party have the right to direct how and for what purpose the asset is used throughout the period of use?");
		q5.setEnabled(false);
		c.add(q5);

		Question q6 = new Question(6,
				"Does the customer have the right to operate the asset throughout the period of use, without the supplier having the right to change those operating instructions?");
		q6.setEnabled(false);
		c.add(q6);

		Question q7 = new Question(7,
				"Did the customer design the asset in a way that predetermines how and for what purpose the asset will be used throughout the period of use?");
		// q7.setVisible(false);
		q7.setEnabled(false);

		c.add(q7);

		// String t = q2.name; we can access name id, like this later if needed

		add(c);
		add(btnSubmit);
		btnSubmit.setVisible(false);

		q1.btnSubmit.addClickHandler(Event -> lastQuestion(q1, q2));
		q2.btnSubmit.addClickHandler(Event -> lastQuestion(q2, q3));
		q3.btnSubmit.addClickHandler(Event -> lastQuestion(q3, q4));
		q4.btnSubmit.addClickHandler(Event -> lastQuestion(q4, q5));
		q5.btnSubmit.addClickHandler(Event -> lastQuestion(q5, q6));
		q6.btnSubmit.addClickHandler(Event -> lastQuestion(q6, q7));

		btnSubmit.addClickHandler(Event -> submitAllQuestions());

	}

	private void submitAllQuestions() {
		// rpcService.submitAllQuestions(questionList)

	}

	private void lastQuestion(Question OldQuestion, Question NewQuestion) {

		OldQuestion.getRadioYes().setEnabled(false);
		OldQuestion.getRadioNo().setEnabled(false);
		NewQuestion.getRadioYes().setEnabled(true);
		NewQuestion.getRadioNo().setEnabled(true);

		// q1OldQuestion.setEnabled(false);
		//
		// // q2NewQuestion.setVisible(true);
		// q2NewQuestion.setEnabled(true);

	}
}