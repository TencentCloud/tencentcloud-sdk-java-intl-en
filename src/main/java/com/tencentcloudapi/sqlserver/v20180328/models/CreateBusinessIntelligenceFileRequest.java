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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBusinessIntelligenceFileRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 
    */
    @SerializedName("FileURL")
    @Expose
    private String FileURL;

    /**
    * File type. Valid values: `FLAT` (flat file as data source), `SSIS` (.ispac SSIS package file)
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get  
     * @return FileURL 
     */
    public String getFileURL() {
        return this.FileURL;
    }

    /**
     * Set 
     * @param FileURL 
     */
    public void setFileURL(String FileURL) {
        this.FileURL = FileURL;
    }

    /**
     * Get File type. Valid values: `FLAT` (flat file as data source), `SSIS` (.ispac SSIS package file) 
     * @return FileType File type. Valid values: `FLAT` (flat file as data source), `SSIS` (.ispac SSIS package file)
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File type. Valid values: `FLAT` (flat file as data source), `SSIS` (.ispac SSIS package file)
     * @param FileType File type. Valid values: `FLAT` (flat file as data source), `SSIS` (.ispac SSIS package file)
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateBusinessIntelligenceFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBusinessIntelligenceFileRequest(CreateBusinessIntelligenceFileRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.FileURL != null) {
            this.FileURL = new String(source.FileURL);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "FileURL", this.FileURL);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

