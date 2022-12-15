package net.gocoder.gallery.backend.repository;

import net.gocoder.gallery.backend.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    Member findByEmailAndPassword(String email, String password);
}
