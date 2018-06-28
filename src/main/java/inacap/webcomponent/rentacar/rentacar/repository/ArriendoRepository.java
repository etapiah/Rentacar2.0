/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inacap.webcomponent.rentacar.rentacar.repository;

import org.springframework.data.repository.CrudRepository;
import inacap.webcomponent.rentacar.rentacar.model.ArriendoModel;
import org.apache.el.stream.Optional;

/**
 *
 * @author etapiah
 */
public interface ArriendoRepository extends CrudRepository<ArriendoModel, Integer> {

}
