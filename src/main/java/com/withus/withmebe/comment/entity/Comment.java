package com.withus.withmebe.comment.entity;

import com.withus.withmebe.common.entity.BaseEntity;
import com.withus.withmebe.member.entity.Member;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@NoArgsConstructor
@Getter
@Where(clause = "deletedDttm is null")
@SQLDelete(sql = "UPDATE comment SET deletedDttm = LocalDateTime.now() WHERE id = ?")
@EntityListeners(value = AuditingEntityListener.class)
public class Comment extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "comment_id")
  private Long id;

  private Long gatheringId;

  @ManyToOne
  private Member member;

  @Setter
  private String commentContent;

  @Builder
  public Comment(Long gatheringId, Member member, String commentContent) {
    this.gatheringId = gatheringId;
    this.member = member;
    this.commentContent = commentContent;
  }
}
