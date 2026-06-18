/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IaCFile extends AbstractModel {

    /**
    * <p>ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>appid</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>File ID</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>File name.</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>CI/CD name</p>
    */
    @SerializedName("CICDName")
    @Expose
    private String CICDName;

    /**
    * <p>File path</p>
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * <p>File type (1: Dockerfile, 2: Terraform, 3: KubernetesYaml)</p>
    */
    @SerializedName("FileType")
    @Expose
    private Long FileType;

    /**
    * <p>Total number of risks</p>
    */
    @SerializedName("RiskTotalCnt")
    @Expose
    private Long RiskTotalCnt;

    /**
    * <p>Risk level count (0: Low risk, 1: Medium risk, 2: High risk, 3: Critical)</p>
    */
    @SerializedName("RiskLevelCnt")
    @Expose
    private KeyValueInt [] RiskLevelCnt;

    /**
    * <p>Scan time</p>
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * <p>Detection status (0: pending scan, 1: detecting, 2: completed, 3: detection exception)</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Scan failure type (0: No failure, 1: Detection timeout, 2: File format parsing failed, 3: Detection failed)</p>
    */
    @SerializedName("FailType")
    @Expose
    private Long FailType;

    /**
     * Get <p>ID</p> 
     * @return Id <p>ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>ID</p>
     * @param Id <p>ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>appid</p> 
     * @return AppId <p>appid</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>appid</p>
     * @param AppId <p>appid</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>File ID</p> 
     * @return FileId <p>File ID</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>File ID</p>
     * @param FileId <p>File ID</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>File name.</p> 
     * @return FileName <p>File name.</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>File name.</p>
     * @param FileName <p>File name.</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>CI/CD name</p> 
     * @return CICDName <p>CI/CD name</p>
     */
    public String getCICDName() {
        return this.CICDName;
    }

    /**
     * Set <p>CI/CD name</p>
     * @param CICDName <p>CI/CD name</p>
     */
    public void setCICDName(String CICDName) {
        this.CICDName = CICDName;
    }

    /**
     * Get <p>File path</p> 
     * @return FilePath <p>File path</p>
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set <p>File path</p>
     * @param FilePath <p>File path</p>
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get <p>File type (1: Dockerfile, 2: Terraform, 3: KubernetesYaml)</p> 
     * @return FileType <p>File type (1: Dockerfile, 2: Terraform, 3: KubernetesYaml)</p>
     */
    public Long getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>File type (1: Dockerfile, 2: Terraform, 3: KubernetesYaml)</p>
     * @param FileType <p>File type (1: Dockerfile, 2: Terraform, 3: KubernetesYaml)</p>
     */
    public void setFileType(Long FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>Total number of risks</p> 
     * @return RiskTotalCnt <p>Total number of risks</p>
     */
    public Long getRiskTotalCnt() {
        return this.RiskTotalCnt;
    }

    /**
     * Set <p>Total number of risks</p>
     * @param RiskTotalCnt <p>Total number of risks</p>
     */
    public void setRiskTotalCnt(Long RiskTotalCnt) {
        this.RiskTotalCnt = RiskTotalCnt;
    }

    /**
     * Get <p>Risk level count (0: Low risk, 1: Medium risk, 2: High risk, 3: Critical)</p> 
     * @return RiskLevelCnt <p>Risk level count (0: Low risk, 1: Medium risk, 2: High risk, 3: Critical)</p>
     */
    public KeyValueInt [] getRiskLevelCnt() {
        return this.RiskLevelCnt;
    }

    /**
     * Set <p>Risk level count (0: Low risk, 1: Medium risk, 2: High risk, 3: Critical)</p>
     * @param RiskLevelCnt <p>Risk level count (0: Low risk, 1: Medium risk, 2: High risk, 3: Critical)</p>
     */
    public void setRiskLevelCnt(KeyValueInt [] RiskLevelCnt) {
        this.RiskLevelCnt = RiskLevelCnt;
    }

    /**
     * Get <p>Scan time</p> 
     * @return ScanTime <p>Scan time</p>
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set <p>Scan time</p>
     * @param ScanTime <p>Scan time</p>
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get <p>Detection status (0: pending scan, 1: detecting, 2: completed, 3: detection exception)</p> 
     * @return Status <p>Detection status (0: pending scan, 1: detecting, 2: completed, 3: detection exception)</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Detection status (0: pending scan, 1: detecting, 2: completed, 3: detection exception)</p>
     * @param Status <p>Detection status (0: pending scan, 1: detecting, 2: completed, 3: detection exception)</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Scan failure type (0: No failure, 1: Detection timeout, 2: File format parsing failed, 3: Detection failed)</p> 
     * @return FailType <p>Scan failure type (0: No failure, 1: Detection timeout, 2: File format parsing failed, 3: Detection failed)</p>
     */
    public Long getFailType() {
        return this.FailType;
    }

    /**
     * Set <p>Scan failure type (0: No failure, 1: Detection timeout, 2: File format parsing failed, 3: Detection failed)</p>
     * @param FailType <p>Scan failure type (0: No failure, 1: Detection timeout, 2: File format parsing failed, 3: Detection failed)</p>
     */
    public void setFailType(Long FailType) {
        this.FailType = FailType;
    }

    public IaCFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IaCFile(IaCFile source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.CICDName != null) {
            this.CICDName = new String(source.CICDName);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.FileType != null) {
            this.FileType = new Long(source.FileType);
        }
        if (source.RiskTotalCnt != null) {
            this.RiskTotalCnt = new Long(source.RiskTotalCnt);
        }
        if (source.RiskLevelCnt != null) {
            this.RiskLevelCnt = new KeyValueInt[source.RiskLevelCnt.length];
            for (int i = 0; i < source.RiskLevelCnt.length; i++) {
                this.RiskLevelCnt[i] = new KeyValueInt(source.RiskLevelCnt[i]);
            }
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FailType != null) {
            this.FailType = new Long(source.FailType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "CICDName", this.CICDName);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "RiskTotalCnt", this.RiskTotalCnt);
        this.setParamArrayObj(map, prefix + "RiskLevelCnt.", this.RiskLevelCnt);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailType", this.FailType);

    }
}

