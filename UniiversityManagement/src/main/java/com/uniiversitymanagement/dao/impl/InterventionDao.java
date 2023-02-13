/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniiversitymanagement.dao.impl;

import com.uniiversitymanagement.dao.AbstractDao;
import com.uniiversitymanagement.dao.InterventionDaoInterface;
import com.uniiversitymanagement.entity.Intervention;
import javax.ejb.Stateless;

/**
 *
 * @author Harmony Bunny
 */
@Stateless
public class InterventionDao extends AbstractDao<Intervention, Long>
	implements InterventionDaoInterface {

	public InterventionDao() {
		super(Intervention.class);
	}

}
