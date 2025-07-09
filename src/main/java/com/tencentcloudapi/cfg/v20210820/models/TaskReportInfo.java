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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskReportInfo extends AbstractModel {

    /**
    * 0: not started; 1: exporting; 2: export successful; 3: export failed.
    */
    @SerializedName("Stage")
    @Expose
    private Long Stage;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * End time of the validity period
    */
    @SerializedName("ExpirationTime")
    @Expose
    private String ExpirationTime;

    /**
    * Whether it is effective
    */
    @SerializedName("Expired")
    @Expose
    private Boolean Expired;

    /**
    * Address of the COS experiment report file
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CosUrl")
    @Expose
    private String CosUrl;

    /**
    * Experiment report export log
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Log")
    @Expose
    private String Log;

    /**
     * Get 0: not started; 1: exporting; 2: export successful; 3: export failed. 
     * @return Stage 0: not started; 1: exporting; 2: export successful; 3: export failed.
     */
    public Long getStage() {
        return this.Stage;
    }

    /**
     * Set 0: not started; 1: exporting; 2: export successful; 3: export failed.
     * @param Stage 0: not started; 1: exporting; 2: export successful; 3: export failed.
     */
    public void setStage(Long Stage) {
        this.Stage = Stage;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get End time of the validity period 
     * @return ExpirationTime End time of the validity period
     */
    public String getExpirationTime() {
        return this.ExpirationTime;
    }

    /**
     * Set End time of the validity period
     * @param ExpirationTime End time of the validity period
     */
    public void setExpirationTime(String ExpirationTime) {
        this.ExpirationTime = ExpirationTime;
    }

    /**
     * Get Whether it is effective 
     * @return Expired Whether it is effective
     */
    public Boolean getExpired() {
        return this.Expired;
    }

    /**
     * Set Whether it is effective
     * @param Expired Whether it is effective
     */
    public void setExpired(Boolean Expired) {
        this.Expired = Expired;
    }

    /**
     * Get Address of the COS experiment report file
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CosUrl Address of the COS experiment report file
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCosUrl() {
        return this.CosUrl;
    }

    /**
     * Set Address of the COS experiment report file
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CosUrl Address of the COS experiment report file
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCosUrl(String CosUrl) {
        this.CosUrl = CosUrl;
    }

    /**
     * Get Experiment report export log
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Log Experiment report export log
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLog() {
        return this.Log;
    }

    /**
     * Set Experiment report export log
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Log Experiment report export log
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLog(String Log) {
        this.Log = Log;
    }

    public TaskReportInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskReportInfo(TaskReportInfo source) {
        if (source.Stage != null) {
            this.Stage = new Long(source.Stage);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpirationTime != null) {
            this.ExpirationTime = new String(source.ExpirationTime);
        }
        if (source.Expired != null) {
            this.Expired = new Boolean(source.Expired);
        }
        if (source.CosUrl != null) {
            this.CosUrl = new String(source.CosUrl);
        }
        if (source.Log != null) {
            this.Log = new String(source.Log);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Stage", this.Stage);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpirationTime", this.ExpirationTime);
        this.setParamSimple(map, prefix + "Expired", this.Expired);
        this.setParamSimple(map, prefix + "CosUrl", this.CosUrl);
        this.setParamSimple(map, prefix + "Log", this.Log);

    }
}

