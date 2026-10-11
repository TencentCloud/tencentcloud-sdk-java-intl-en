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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtectDirInfo extends AbstractModel {

    /**
    * Website name
    */
    @SerializedName("DirName")
    @Expose
    private String DirName;

    /**
    * Website protection directory address
    */
    @SerializedName("DirPath")
    @Expose
    private String DirPath;

    /**
    * Number of associated servers
    */
    @SerializedName("RelatedServerNum")
    @Expose
    private Long RelatedServerNum;

    /**
    * Number of protected servers
    */
    @SerializedName("ProtectServerNum")
    @Expose
    private Long ProtectServerNum;

    /**
    * Number of unprotected servers
    */
    @SerializedName("NoProtectServerNum")
    @Expose
    private Long NoProtectServerNum;

    /**
    * Unique ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Protection status
    */
    @SerializedName("ProtectStatus")
    @Expose
    private Long ProtectStatus;

    /**
    * Protection exception
    */
    @SerializedName("ProtectException")
    @Expose
    private Long ProtectException;

    /**
    * Auto recovery switch (returned when filtering Quuid by Filters). Default value: 0
    */
    @SerializedName("AutoRestoreSwitchStatus")
    @Expose
    private Long AutoRestoreSwitchStatus;

    /**
    * First activation time of protection
    */
    @SerializedName("FirstProtectTime")
    @Expose
    private String FirstProtectTime;

    /**
    * Latest activation time of protection
    */
    @SerializedName("LatestProtectTime")
    @Expose
    private String LatestProtectTime;

    /**
    * Protected file types
    */
    @SerializedName("ProtectFileType")
    @Expose
    private String ProtectFileType;

    /**
    * Total number of protected files
    */
    @SerializedName("ProtectFilesCount")
    @Expose
    private Long ProtectFilesCount;

    /**
     * Get Website name 
     * @return DirName Website name
     */
    public String getDirName() {
        return this.DirName;
    }

    /**
     * Set Website name
     * @param DirName Website name
     */
    public void setDirName(String DirName) {
        this.DirName = DirName;
    }

    /**
     * Get Website protection directory address 
     * @return DirPath Website protection directory address
     */
    public String getDirPath() {
        return this.DirPath;
    }

    /**
     * Set Website protection directory address
     * @param DirPath Website protection directory address
     */
    public void setDirPath(String DirPath) {
        this.DirPath = DirPath;
    }

    /**
     * Get Number of associated servers 
     * @return RelatedServerNum Number of associated servers
     */
    public Long getRelatedServerNum() {
        return this.RelatedServerNum;
    }

    /**
     * Set Number of associated servers
     * @param RelatedServerNum Number of associated servers
     */
    public void setRelatedServerNum(Long RelatedServerNum) {
        this.RelatedServerNum = RelatedServerNum;
    }

    /**
     * Get Number of protected servers 
     * @return ProtectServerNum Number of protected servers
     */
    public Long getProtectServerNum() {
        return this.ProtectServerNum;
    }

    /**
     * Set Number of protected servers
     * @param ProtectServerNum Number of protected servers
     */
    public void setProtectServerNum(Long ProtectServerNum) {
        this.ProtectServerNum = ProtectServerNum;
    }

    /**
     * Get Number of unprotected servers 
     * @return NoProtectServerNum Number of unprotected servers
     */
    public Long getNoProtectServerNum() {
        return this.NoProtectServerNum;
    }

    /**
     * Set Number of unprotected servers
     * @param NoProtectServerNum Number of unprotected servers
     */
    public void setNoProtectServerNum(Long NoProtectServerNum) {
        this.NoProtectServerNum = NoProtectServerNum;
    }

    /**
     * Get Unique ID 
     * @return Id Unique ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Unique ID
     * @param Id Unique ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Protection status 
     * @return ProtectStatus Protection status
     */
    public Long getProtectStatus() {
        return this.ProtectStatus;
    }

    /**
     * Set Protection status
     * @param ProtectStatus Protection status
     */
    public void setProtectStatus(Long ProtectStatus) {
        this.ProtectStatus = ProtectStatus;
    }

    /**
     * Get Protection exception 
     * @return ProtectException Protection exception
     */
    public Long getProtectException() {
        return this.ProtectException;
    }

    /**
     * Set Protection exception
     * @param ProtectException Protection exception
     */
    public void setProtectException(Long ProtectException) {
        this.ProtectException = ProtectException;
    }

    /**
     * Get Auto recovery switch (returned when filtering Quuid by Filters). Default value: 0 
     * @return AutoRestoreSwitchStatus Auto recovery switch (returned when filtering Quuid by Filters). Default value: 0
     */
    public Long getAutoRestoreSwitchStatus() {
        return this.AutoRestoreSwitchStatus;
    }

    /**
     * Set Auto recovery switch (returned when filtering Quuid by Filters). Default value: 0
     * @param AutoRestoreSwitchStatus Auto recovery switch (returned when filtering Quuid by Filters). Default value: 0
     */
    public void setAutoRestoreSwitchStatus(Long AutoRestoreSwitchStatus) {
        this.AutoRestoreSwitchStatus = AutoRestoreSwitchStatus;
    }

    /**
     * Get First activation time of protection 
     * @return FirstProtectTime First activation time of protection
     */
    public String getFirstProtectTime() {
        return this.FirstProtectTime;
    }

    /**
     * Set First activation time of protection
     * @param FirstProtectTime First activation time of protection
     */
    public void setFirstProtectTime(String FirstProtectTime) {
        this.FirstProtectTime = FirstProtectTime;
    }

    /**
     * Get Latest activation time of protection 
     * @return LatestProtectTime Latest activation time of protection
     */
    public String getLatestProtectTime() {
        return this.LatestProtectTime;
    }

    /**
     * Set Latest activation time of protection
     * @param LatestProtectTime Latest activation time of protection
     */
    public void setLatestProtectTime(String LatestProtectTime) {
        this.LatestProtectTime = LatestProtectTime;
    }

    /**
     * Get Protected file types 
     * @return ProtectFileType Protected file types
     */
    public String getProtectFileType() {
        return this.ProtectFileType;
    }

    /**
     * Set Protected file types
     * @param ProtectFileType Protected file types
     */
    public void setProtectFileType(String ProtectFileType) {
        this.ProtectFileType = ProtectFileType;
    }

    /**
     * Get Total number of protected files 
     * @return ProtectFilesCount Total number of protected files
     */
    public Long getProtectFilesCount() {
        return this.ProtectFilesCount;
    }

    /**
     * Set Total number of protected files
     * @param ProtectFilesCount Total number of protected files
     */
    public void setProtectFilesCount(Long ProtectFilesCount) {
        this.ProtectFilesCount = ProtectFilesCount;
    }

    public ProtectDirInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectDirInfo(ProtectDirInfo source) {
        if (source.DirName != null) {
            this.DirName = new String(source.DirName);
        }
        if (source.DirPath != null) {
            this.DirPath = new String(source.DirPath);
        }
        if (source.RelatedServerNum != null) {
            this.RelatedServerNum = new Long(source.RelatedServerNum);
        }
        if (source.ProtectServerNum != null) {
            this.ProtectServerNum = new Long(source.ProtectServerNum);
        }
        if (source.NoProtectServerNum != null) {
            this.NoProtectServerNum = new Long(source.NoProtectServerNum);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ProtectStatus != null) {
            this.ProtectStatus = new Long(source.ProtectStatus);
        }
        if (source.ProtectException != null) {
            this.ProtectException = new Long(source.ProtectException);
        }
        if (source.AutoRestoreSwitchStatus != null) {
            this.AutoRestoreSwitchStatus = new Long(source.AutoRestoreSwitchStatus);
        }
        if (source.FirstProtectTime != null) {
            this.FirstProtectTime = new String(source.FirstProtectTime);
        }
        if (source.LatestProtectTime != null) {
            this.LatestProtectTime = new String(source.LatestProtectTime);
        }
        if (source.ProtectFileType != null) {
            this.ProtectFileType = new String(source.ProtectFileType);
        }
        if (source.ProtectFilesCount != null) {
            this.ProtectFilesCount = new Long(source.ProtectFilesCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirName", this.DirName);
        this.setParamSimple(map, prefix + "DirPath", this.DirPath);
        this.setParamSimple(map, prefix + "RelatedServerNum", this.RelatedServerNum);
        this.setParamSimple(map, prefix + "ProtectServerNum", this.ProtectServerNum);
        this.setParamSimple(map, prefix + "NoProtectServerNum", this.NoProtectServerNum);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ProtectStatus", this.ProtectStatus);
        this.setParamSimple(map, prefix + "ProtectException", this.ProtectException);
        this.setParamSimple(map, prefix + "AutoRestoreSwitchStatus", this.AutoRestoreSwitchStatus);
        this.setParamSimple(map, prefix + "FirstProtectTime", this.FirstProtectTime);
        this.setParamSimple(map, prefix + "LatestProtectTime", this.LatestProtectTime);
        this.setParamSimple(map, prefix + "ProtectFileType", this.ProtectFileType);
        this.setParamSimple(map, prefix + "ProtectFilesCount", this.ProtectFilesCount);

    }
}

