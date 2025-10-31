package org.example.google2;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UserRepository extends Neo4jRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}
