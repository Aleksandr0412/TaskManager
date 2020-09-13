package org.vtb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vtb.entity.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}
