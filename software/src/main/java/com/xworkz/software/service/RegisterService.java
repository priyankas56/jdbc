package com.xworkz.software.service;

import com.xworkz.software.dto.RegisterDTO;

public interface RegisterService {
  boolean validateAndSave(RegisterDTO registerDTO);
}
