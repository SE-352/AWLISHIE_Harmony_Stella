/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniiversitymanagement.dao.impl;

import com.uniiversitymanagement.dao.AbstractDao;
import com.uniiversitymanagement.dao.CoursDaoInterface;
import com.uniiversitymanagement.entity.Cours;
import javax.ejb.Stateless;

/**
 *
 * @author Harmony Bunny
 */
@Stateless
public class CoursDao extends AbstractDao<Cours, Long> implements CoursDaoInterface {

	public CoursDao() {
		super(Cours.class);
	}

}
