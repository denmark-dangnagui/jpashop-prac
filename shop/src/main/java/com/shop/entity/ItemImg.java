package com.shop.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name = "item_img")
public class ItemImg {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    private String imgName; // 이미지 파일명

    private String oriImage; // 원본 이미지 파일명

    private String imgUrl; // 이미지 조회 경로

    private String repimgYn; // 대표 이미지 여부

    public void updateItemImg(String oriImage, String imgName, String imgUrl){
        this.oriImage = oriImage;
        this.imgName = imgName;
        this.imgUrl = imgUrl;
    }

}
