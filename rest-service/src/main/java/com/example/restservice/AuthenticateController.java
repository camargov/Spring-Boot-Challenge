package com.example.restservice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

/* This class represents an authentication process for the API. */
@RestController
public class AuthenticateController {

    /* Import statements for org.springframework.security is not working so the following code is commented out

    @PostMapping("user")
	public User login(@RequestParam("user") String username, @RequestParam("password") String password) {
		String token = getJWTToken(username);
		User user = new User();
		user.setUser(username);
		user.setToken(token);		
		return user;
	}

    private String getJWTToken(String username) {
		String secretKey = "mySecretKey";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
				.commaSeparatedStringToAuthorityList("ROLE_USER");
		
		String token = Jwts
				.builder()
				.setId("softtekJWT")
				.setSubject(username)
				.claim("authorities",
						grantedAuthorities.stream()
								.map(GrantedAuthority::getAuthority)
								.collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();
		return "Bearer " + token;
	}
    */
}
