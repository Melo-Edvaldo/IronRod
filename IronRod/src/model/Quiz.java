/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author kburkart
 */
public class Quiz implements Serializable {
    
    private String scripture;
    private String question;
    private char answer;

    public Quiz() {
    }

    public Quiz(String scripture, String question, char answer) {
        this.scripture = scripture;
        this.question = question;
        this.answer = answer;
    }

    public String getScripture() {
        return scripture;
    }

    public void setScripture(String scripture) {
        this.scripture = scripture;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public char getAnswer() {
        return answer;
    }

    public void setAnswer(char answer) {
        this.answer = answer;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.scripture);
        hash = 97 * hash + Objects.hashCode(this.question);
        hash = 97 * hash + this.answer;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Quiz other = (Quiz) obj;
        if (this.answer != other.answer) {
            return false;
        }
        if (!Objects.equals(this.scripture, other.scripture)) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Quiz{" + "scripture=" + scripture + ", question=" + question + ", answer=" + answer + '}';
    }
    
}
