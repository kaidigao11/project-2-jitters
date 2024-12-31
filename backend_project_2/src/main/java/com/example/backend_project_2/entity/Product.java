package com.example.backend_project_2.entity;


import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private Integer rating;

    @Column(nullable = false)
    private String region;

    @Column(nullable = false)
    private Double weight;

    @ElementCollection
    @CollectionTable(name = "product_flavor_profiles", joinColumns = @JoinColumn(name = "product_id"))
    @Column(name = "flavor_profile")
    private List<String> flavorProfile;

    @ElementCollection
    @CollectionTable(name = "product_grind_options", joinColumns = @JoinColumn(name = "product_id"))
    @Column(name = "grind_option")
    private List<String> grindOptions;

    @Column(nullable = false)
    private Integer roastLevel;

    // Relationships
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderDetail> orderDetails;

    // Constructors
    public Product() {
    }

    public Product(String name, String description, String imageUrl, Double price, Integer rating, String region, Double weight, List<String> flavorProfile, List<String> grindOptions, Integer roastLevel) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
        this.rating = rating;
        this.region = region;
        this.weight = weight;
        this.flavorProfile = flavorProfile;
        this.grindOptions = grindOptions;
        this.roastLevel = roastLevel;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public List<String> getFlavorProfile() {
        return flavorProfile;
    }

    public void setFlavorProfile(List<String> flavorProfile) {
        this.flavorProfile = flavorProfile;
    }

    public List<String> getGrindOptions() {
        return grindOptions;
    }

    public void setGrindOptions(List<String> grindOptions) {
        this.grindOptions = grindOptions;
    }

    public Integer getRoastLevel() {
        return roastLevel;
    }

    public void setRoastLevel(Integer roastLevel) {
        this.roastLevel = roastLevel;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
