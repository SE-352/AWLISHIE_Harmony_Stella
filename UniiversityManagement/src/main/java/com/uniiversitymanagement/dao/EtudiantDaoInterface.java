/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniiversitymanagement.dao;

import com.uniiversitymanagement.entity.Etudiant;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Harmony Bunny
 */
@Local
public interface EtudiantDaoInterface extends DaoInterface<Etudiant, Long> {

	public List<String> getNames();
}
