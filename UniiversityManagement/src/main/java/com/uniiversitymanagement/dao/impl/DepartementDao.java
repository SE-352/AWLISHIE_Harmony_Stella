/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniiversitymanagement.dao.impl;

import com.uniiversitymanagement.dao.AbstractDao;
import com.uniiversitymanagement.dao.DepartementDaoInterface;
import com.uniiversitymanagement.entity.Departement;
import javax.ejb.Stateless;

/**
 *
 * @author Harmony Bunny
 */
@Stateless
public class DepartementDao extends AbstractDao<Departement, Long> implements DepartementDaoInterface {

	public DepartementDao() {
		super(Departement.class);
	}

}
