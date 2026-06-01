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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogToCLSConfig extends AbstractModel {

    /**
    * Delivery status on or turn off
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * CLS Logset ID
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * Log topic ID
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

    /**
    * Region of the CLS service
    */
    @SerializedName("ClsRegion")
    @Expose
    private String ClsRegion;

    /**
     * Get Delivery status on or turn off 
     * @return Status Delivery status on or turn off
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Delivery status on or turn off
     * @param Status Delivery status on or turn off
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get CLS Logset ID 
     * @return LogSetId CLS Logset ID
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set CLS Logset ID
     * @param LogSetId CLS Logset ID
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get Log topic ID 
     * @return LogTopicId Log topic ID
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set Log topic ID
     * @param LogTopicId Log topic ID
     */
    public void setLogTopicId(String LogTopicId) {
        this.LogTopicId = LogTopicId;
    }

    /**
     * Get Region of the CLS service 
     * @return ClsRegion Region of the CLS service
     */
    public String getClsRegion() {
        return this.ClsRegion;
    }

    /**
     * Set Region of the CLS service
     * @param ClsRegion Region of the CLS service
     */
    public void setClsRegion(String ClsRegion) {
        this.ClsRegion = ClsRegion;
    }

    public LogToCLSConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogToCLSConfig(LogToCLSConfig source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.LogSetId != null) {
            this.LogSetId = new String(source.LogSetId);
        }
        if (source.LogTopicId != null) {
            this.LogTopicId = new String(source.LogTopicId);
        }
        if (source.ClsRegion != null) {
            this.ClsRegion = new String(source.ClsRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "LogTopicId", this.LogTopicId);
        this.setParamSimple(map, prefix + "ClsRegion", this.ClsRegion);

    }
}

