/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniiversitymanagement.dao.impl;

import com.uniiversitymanagement.dao.AbstractDao;
import com.uniiversitymanagement.dao.ProfesseurDaoInterface;
import com.uniiversitymanagement.entity.Professeur;
import javax.ejb.Stateless;

/**
 *
 * @author Harmony Bunny
 */
@Stateless
public class ProfesseurDao extends AbstractDao<Professeur, Long>
	implements ProfesseurDaoInterface {

	public ProfesseurDao() {
		super(Professeur.class);
	}

}
