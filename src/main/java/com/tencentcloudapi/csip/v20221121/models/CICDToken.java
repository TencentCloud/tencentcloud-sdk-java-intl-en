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

public class CICDToken extends AbstractModel {

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
    * <p>CI/CD name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Token for integration</p>
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * <p>Scanning result storage duration</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>Scanned file</p>
    */
    @SerializedName("FileCnt")
    @Expose
    private Long FileCnt;

    /**
    * <p>Latest scan status</p>
    */
    @SerializedName("LastScanStatus")
    @Expose
    private String LastScanStatus;

    /**
    * <p>Last scan time.</p>
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

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
     * Get <p>CI/CD name</p> 
     * @return Name <p>CI/CD name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>CI/CD name</p>
     * @param Name <p>CI/CD name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Token for integration</p> 
     * @return Token <p>Token for integration</p>
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set <p>Token for integration</p>
     * @param Token <p>Token for integration</p>
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get <p>Scanning result storage duration</p> 
     * @return Period <p>Scanning result storage duration</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>Scanning result storage duration</p>
     * @param Period <p>Scanning result storage duration</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>Scanned file</p> 
     * @return FileCnt <p>Scanned file</p>
     */
    public Long getFileCnt() {
        return this.FileCnt;
    }

    /**
     * Set <p>Scanned file</p>
     * @param FileCnt <p>Scanned file</p>
     */
    public void setFileCnt(Long FileCnt) {
        this.FileCnt = FileCnt;
    }

    /**
     * Get <p>Latest scan status</p> 
     * @return LastScanStatus <p>Latest scan status</p>
     */
    public String getLastScanStatus() {
        return this.LastScanStatus;
    }

    /**
     * Set <p>Latest scan status</p>
     * @param LastScanStatus <p>Latest scan status</p>
     */
    public void setLastScanStatus(String LastScanStatus) {
        this.LastScanStatus = LastScanStatus;
    }

    /**
     * Get <p>Last scan time.</p> 
     * @return LastScanTime <p>Last scan time.</p>
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set <p>Last scan time.</p>
     * @param LastScanTime <p>Last scan time.</p>
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    public CICDToken() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CICDToken(CICDToken source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.FileCnt != null) {
            this.FileCnt = new Long(source.FileCnt);
        }
        if (source.LastScanStatus != null) {
            this.LastScanStatus = new String(source.LastScanStatus);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "FileCnt", this.FileCnt);
        this.setParamSimple(map, prefix + "LastScanStatus", this.LastScanStatus);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);

    }
}

