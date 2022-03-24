package com.example.demoreport.service.dto;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Objects;

/**
 * A DTO for the Report entity.
 */
public class ReportDTO implements Serializable {

    private Long id;

    private String title;

    private Boolean showLogo;

    private String logoImg;

    private ZonedDateTime date;

    private String evaluator;

    private String professionalData;

    private Boolean showContent;

    private String introduction;

    private String objectives;

    private String methodology;

    private String principalConclusions;

    private Boolean showCompanyInfo;

    private String company;

    private String companyId;

    private String companyAddress;

    private String companyContactData;

    private String companyAdditionalData;

    private String companyImg;

    private Boolean showTask;

    private String task;

    private String workstation;

    private String workArea;

    private String workstationDescription;

    private String personalProtection;

    private String organizationalFactors;

    private String environmentalFactors;

    private String taskAdditionalData;

    private Boolean showWorkstationImg;

    private String workstationImg;

    private Boolean showWorkerInfo;

    private String employee;

    private String document;

    private String hand;

    private String sex;

    private ZonedDateTime birthDate;

    private Float weight;

    private Float height;

    private String companyTime;

    private String workStationTime;

    private String medicalHistory;

    private String occupationalHistory;

    private String employeeAdditionalData;

    private Boolean showMethodMethodology;

    private String methodMethodology;

    private Boolean showActivitiesMethodology;

    private String activitiesMethodology;

    private Boolean showFile;

    private Boolean showConclusions;

    private String conclusions;

    private Boolean showRecommendations;

    private String recommendations;

    private Boolean showReferences;

    private String references;

    private Boolean showAdditionalImg;

    private String image1;

    private String image2;

    private String image3;

    private String image4;

    private Long evaluationId;

    private List<String> images;

    private Integer evaluationNumber;

    private ZonedDateTime evaluationDate;

    private String evaluationEmployee;

    private String evaluationEvaluator;

    private String evaluationVariables;

    private Float evaluationRiskValue;

    private String evaluationRiskColor;

    private String evaluationRiskLevel;

    private String evaluationActionLevel;

    private String evaluationMethod;

    private Long evaluationMethodId;

    private String evaluationImageUrl;

    public String getEvaluationMethod() {
        return evaluationMethod;
    }

    public void setEvaluationMethod(String evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
    }

    public Long getEvaluationMethodId() {
        return evaluationMethodId;
    }

    public void setEvaluationMethodId(Long evaluationMethodId) {
        this.evaluationMethodId = evaluationMethodId;
    }

    public String getEvaluationImageUrl() {
        return evaluationImageUrl;
    }

    public void setEvaluationImageUrl(String evaluationImageUrl) {
        this.evaluationImageUrl = evaluationImageUrl;
    }

    public String getEvaluationVariables() {
        return evaluationVariables;
    }

    public void setEvaluationVariables(String evaluationVariables) {
        this.evaluationVariables = evaluationVariables;
    }

    public Float getEvaluationRiskValue() {
        return evaluationRiskValue;
    }

    public void setEvaluationRiskValue(Float evaluationRiskValue) {
        this.evaluationRiskValue = evaluationRiskValue;
    }

    public String getEvaluationRiskColor() {
        return evaluationRiskColor;
    }

    public void setEvaluationRiskColor(String evaluationRiskColor) {
        this.evaluationRiskColor = evaluationRiskColor;
    }

    public String getEvaluationRiskLevel() {
        return evaluationRiskLevel;
    }

    public void setEvaluationRiskLevel(String evaluationRiskLevel) {
        this.evaluationRiskLevel = evaluationRiskLevel;
    }

    public String getEvaluationActionLevel() {
        return evaluationActionLevel;
    }

    public void setEvaluationActionLevel(String evaluationActionLevel) {
        this.evaluationActionLevel = evaluationActionLevel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean isShowLogo() {
        return showLogo;
    }

    public String getLogoImg() {
        return logoImg;
    }

    public void setLogoImg(String logoImg) {
        this.logoImg = logoImg;
    }

    public void setShowLogo(Boolean showLogo) {
        this.showLogo = showLogo;
    }

    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }

    public String getEvaluator() {
        return evaluator;
    }

    public void setEvaluator(String evaluator) {
        this.evaluator = evaluator;
    }

    public String getProfessionalData() {
        return professionalData;
    }

    public void setProfessionalData(String professionalData) {
        this.professionalData = professionalData;
    }

    public Boolean isShowContent() {
        return showContent;
    }

    public void setShowContent(Boolean showContent) {
        this.showContent = showContent;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getObjectives() {
        return objectives;
    }

    public void setObjectives(String objectives) {
        this.objectives = objectives;
    }

    public String getMethodology() {
        return methodology;
    }

    public void setMethodology(String methodology) {
        this.methodology = methodology;
    }

    public String getPrincipalConclusions() {
        return principalConclusions;
    }

    public void setPrincipalConclusions(String principalConclusions) {
        this.principalConclusions = principalConclusions;
    }

    public Boolean isShowCompanyInfo() {
        return showCompanyInfo;
    }

    public void setShowCompanyInfo(Boolean showCompanyInfo) {
        this.showCompanyInfo = showCompanyInfo;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyContactData() {
        return companyContactData;
    }

    public void setCompanyContactData(String companyContactData) {
        this.companyContactData = companyContactData;
    }

    public String getCompanyAdditionalData() {
        return companyAdditionalData;
    }

    public void setCompanyAdditionalData(String companyAdditionalData) {
        this.companyAdditionalData = companyAdditionalData;
    }

    public String getCompanyImg() {
        return companyImg;
    }

    public void setCompanyImg(String companyImg) {
        this.companyImg = companyImg;
    }

    public Boolean isShowTask() {
        return showTask;
    }

    public void setShowTask(Boolean showTask) {
        this.showTask = showTask;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getWorkstation() {
        return workstation;
    }

    public void setWorkstation(String workstation) {
        this.workstation = workstation;
    }

    public String getWorkArea() {
        return workArea;
    }

    public void setWorkArea(String workArea) {
        this.workArea = workArea;
    }

    public String getWorkstationDescription() {
        return workstationDescription;
    }

    public void setWorkstationDescription(String workstationDescription) {
        this.workstationDescription = workstationDescription;
    }

    public String getPersonalProtection() {
        return personalProtection;
    }

    public void setPersonalProtection(String personalProtection) {
        this.personalProtection = personalProtection;
    }

    public String getOrganizationalFactors() {
        return organizationalFactors;
    }

    public void setOrganizationalFactors(String organizationalFactors) {
        this.organizationalFactors = organizationalFactors;
    }

    public String getEnvironmentalFactors() {
        return environmentalFactors;
    }

    public void setEnvironmentalFactors(String environmentalFactors) {
        this.environmentalFactors = environmentalFactors;
    }

    public String getTaskAdditionalData() {
        return taskAdditionalData;
    }

    public void setTaskAdditionalData(String taskAdditionalData) {
        this.taskAdditionalData = taskAdditionalData;
    }

    public Boolean isShowWorkstationImg() {
        return showWorkstationImg;
    }

    public void setShowWorkstationImg(Boolean showWorkstationImg) {
        this.showWorkstationImg = showWorkstationImg;
    }

    public String getWorkstationImg() {
        return workstationImg;
    }

    public void setWorkstationImg(String workstationImg) {
        this.workstationImg = workstationImg;
    }

    public Boolean isShowWorkerInfo() {
        return showWorkerInfo;
    }

    public void setShowWorkerInfo(Boolean showWorkerInfo) {
        this.showWorkerInfo = showWorkerInfo;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public ZonedDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(ZonedDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public String getCompanyTime() {
        return companyTime;
    }

    public void setCompanyTime(String companyTime) {
        this.companyTime = companyTime;
    }

    public String getWorkStationTime() {
        return workStationTime;
    }

    public void setWorkStationTime(String workStationTime) {
        this.workStationTime = workStationTime;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getOccupationalHistory() {
        return occupationalHistory;
    }

    public void setOccupationalHistory(String occupationalHistory) {
        this.occupationalHistory = occupationalHistory;
    }

    public String getEmployeeAdditionalData() {
        return employeeAdditionalData;
    }

    public void setEmployeeAdditionalData(String employeeAdditionalData) {
        this.employeeAdditionalData = employeeAdditionalData;
    }

    public Boolean isShowMethodMethodology() {
        return showMethodMethodology;
    }

    public void setShowMethodMethodology(Boolean showMethodMethodology) {
        this.showMethodMethodology = showMethodMethodology;
    }

    public String getMethodMethodology() {
        return methodMethodology;
    }

    public void setMethodMethodology(String methodMethodology) {
        this.methodMethodology = methodMethodology;
    }

    public Boolean isShowActivitiesMethodology() {
        return showActivitiesMethodology;
    }

    public void setShowActivitiesMethodology(Boolean showActivitiesMethodology) {
        this.showActivitiesMethodology = showActivitiesMethodology;
    }

    public String getActivitiesMethodology() {
        return activitiesMethodology;
    }

    public void setActivitiesMethodology(String activitiesMethodology) {
        this.activitiesMethodology = activitiesMethodology;
    }

    public Boolean isShowFile() {
        return showFile;
    }

    public void setShowFile(Boolean showFile) {
        this.showFile = showFile;
    }

    public Boolean isShowConclusions() {
        return showConclusions;
    }

    public void setShowConclusions(Boolean showConclusions) {
        this.showConclusions = showConclusions;
    }

    public String getConclusions() {
        return conclusions;
    }

    public void setConclusions(String conclusions) {
        this.conclusions = conclusions;
    }

    public Boolean isShowRecommendations() {
        return showRecommendations;
    }

    public void setShowRecommendations(Boolean showRecommendations) {
        this.showRecommendations = showRecommendations;
    }

    public String getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
    }

    public Boolean isShowReferences() {
        return showReferences;
    }

    public void setShowReferences(Boolean showReferences) {
        this.showReferences = showReferences;
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }

    public Boolean isShowAdditionalImg() {
        return showAdditionalImg;
    }

    public void setShowAdditionalImg(Boolean showAdditionalImg) {
        this.showAdditionalImg = showAdditionalImg;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getImage4() {
        return image4;
    }

    public void setImage4(String image4) {
        this.image4 = image4;
    }

    public Long getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Long evaluationId) {
        this.evaluationId = evaluationId;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public Integer getEvaluationNumber() {
        return evaluationNumber;
    }

    public void setEvaluationNumber(Integer evaluationNumber) {
        this.evaluationNumber = evaluationNumber;
    }

    public ZonedDateTime getEvaluationDate() {
        return evaluationDate;
    }

    public void setEvaluationDate(ZonedDateTime evaluationDate) {
        this.evaluationDate = evaluationDate;
    }

    public String getEvaluationEmployee() {
        return evaluationEmployee;
    }

    public void setEvaluationEmployee(String evaluationEmployee) {
        this.evaluationEmployee = evaluationEmployee;
    }

    public String getEvaluationEvaluator() {
        return evaluationEvaluator;
    }

    public void setEvaluationEvaluator(String evaluationEvaluator) {
        this.evaluationEvaluator = evaluationEvaluator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ReportDTO reportDTO = (ReportDTO) o;
        if (reportDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), reportDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ReportDTO{" +
                "id=" + getId() +
                ", title='" + getTitle() + "'" +
                ", showLogo='" + isShowLogo() + "'" +
                ", date='" + getDate() + "'" +
                ", evaluator='" + getEvaluator() + "'" +
                ", professionalData='" + getProfessionalData() + "'" +
                ", showContent='" + isShowContent() + "'" +
                ", introduction='" + getIntroduction() + "'" +
                ", objectives='" + getObjectives() + "'" +
                ", methodology='" + getMethodology() + "'" +
                ", principalConclusions='" + getPrincipalConclusions() + "'" +
                ", showCompanyInfo='" + isShowCompanyInfo() + "'" +
                ", company='" + getCompany() + "'" +
                ", companyId='" + getCompanyId() + "'" +
                ", companyAddress='" + getCompanyAddress() + "'" +
                ", companyContactData='" + getCompanyContactData() + "'" +
                ", companyAdditionalData='" + getCompanyAdditionalData() + "'" +
                ", companyImg='" + getCompanyImg() + "'" +
                ", showTask='" + isShowTask() + "'" +
                ", task='" + getTask() + "'" +
                ", workstation='" + getWorkstation() + "'" +
                ", workArea='" + getWorkArea() + "'" +
                ", workstationDescription='" + getWorkstationDescription() + "'" +
                ", personalProtection='" + getPersonalProtection() + "'" +
                ", organizationalFactors='" + getOrganizationalFactors() + "'" +
                ", environmentalFactors='" + getEnvironmentalFactors() + "'" +
                ", taskAdditionalData='" + getTaskAdditionalData() + "'" +
                ", showWorkstationImg='" + isShowWorkstationImg() + "'" +
                ", workstationImg='" + getWorkstationImg() + "'" +
                ", showWorkerInfo='" + isShowWorkerInfo() + "'" +
                ", employee='" + getEmployee() + "'" +
                ", document='" + getDocument() + "'" +
                ", hand='" + getHand() + "'" +
                ", sex='" + getSex() + "'" +
                ", birthDate='" + getBirthDate() + "'" +
                ", weight='" + getWeight() + "'" +
                ", height='" + getHeight() + "'" +
                ", companyTime='" + getCompanyTime() + "'" +
                ", workStationTime='" + getWorkStationTime() + "'" +
                ", medicalHistory='" + getMedicalHistory() + "'" +
                ", occupationalHistory='" + getOccupationalHistory() + "'" +
                ", employeeAdditionalData='" + getEmployeeAdditionalData() + "'" +
                ", showMethodMethodology='" + isShowMethodMethodology() + "'" +
                ", methodMethodology='" + getMethodMethodology() + "'" +
                ", showActivitiesMethodology='" + isShowActivitiesMethodology() + "'" +
                ", activitiesMethodology='" + getActivitiesMethodology() + "'" +
                ", showFile='" + isShowFile() + "'" +
                ", showConclusions='" + isShowConclusions() + "'" +
                ", conclusions='" + getConclusions() + "'" +
                ", showRecommendations='" + isShowRecommendations() + "'" +
                ", recommendations='" + getRecommendations() + "'" +
                ", showReferences='" + isShowReferences() + "'" +
                ", references='" + getReferences() + "'" +
                ", showAdditionalImg='" + isShowAdditionalImg() + "'" +
                ", image1='" + getImage1() + "'" +
                ", image2='" + getImage2() + "'" +
                ", image3='" + getImage3() + "'" +
                ", image4='" + getImage4() + "'" +
                ", evaluation=" + getEvaluationId() +
                "}";
    }
}
