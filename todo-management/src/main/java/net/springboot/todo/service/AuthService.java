package net.springboot.todo.service;

import net.springboot.todo.dto.LoginDto;
import net.springboot.todo.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);
    String login(LoginDto loginDto);
}
