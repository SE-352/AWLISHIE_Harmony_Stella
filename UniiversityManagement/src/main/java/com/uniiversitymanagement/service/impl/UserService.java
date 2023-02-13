/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.uniiversitymanagement.service.impl;

import com.uniiversitymanagement.dao.EtudiantDaoInterface;
import com.uniiversitymanagement.dao.ProfesseurDaoInterface;
import com.uniiversitymanagement.entity.Etudiant;
import com.uniiversitymanagement.service.UserServiceInterface;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.ejb.Stateless;

/**
 *
 * @author Harmony Bunny
 */
@Stateful
public class UserService implements UserServiceInterface{
	
	@EJB
	private ProfesseurDaoInterface professeurDao;
	
	@EJB
	private  EtudiantDaoInterface etudiantDao;
	
	@Override
	public Etudiant saveEtudiant(Etudiant e) {
		
		return e;
	}

}
