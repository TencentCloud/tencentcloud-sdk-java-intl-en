/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeParamTemplateDetailResponse extends AbstractModel{

    /**
    * Parameter template ID
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * Parameter template name
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Parameter template description
    */
    @SerializedName("TemplateDescription")
    @Expose
    private String TemplateDescription;

    /**
    * Engine version
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * Total number of parameters
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of parameters
    */
    @SerializedName("Items")
    @Expose
    private ParamDetail [] Items;

    /**
    * Database type. Valid values:  `NORMAL`, `SERVERLESS`.
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Parameter template ID 
     * @return TemplateId Parameter template ID
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Parameter template ID
     * @param TemplateId Parameter template ID
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Parameter template name 
     * @return TemplateName Parameter template name
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Parameter template name
     * @param TemplateName Parameter template name
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Parameter template description 
     * @return TemplateDescription Parameter template description
     */
    public String getTemplateDescription() {
        return this.TemplateDescription;
    }

    /**
     * Set Parameter template description
     * @param TemplateDescription Parameter template description
     */
    public void setTemplateDescription(String TemplateDescription) {
        this.TemplateDescription = TemplateDescription;
    }

    /**
     * Get Engine version 
     * @return EngineVersion Engine version
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set Engine version
     * @param EngineVersion Engine version
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get Total number of parameters 
     * @return TotalCount Total number of parameters
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of parameters
     * @param TotalCount Total number of parameters
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of parameters 
     * @return Items List of parameters
     */
    public ParamDetail [] getItems() {
        return this.Items;
    }

    /**
     * Set List of parameters
     * @param Items List of parameters
     */
    public void setItems(ParamDetail [] Items) {
        this.Items = Items;
    }

    /**
     * Get Database type. Valid values:  `NORMAL`, `SERVERLESS`. 
     * @return DbMode Database type. Valid values:  `NORMAL`, `SERVERLESS`.
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set Database type. Valid values:  `NORMAL`, `SERVERLESS`.
     * @param DbMode Database type. Valid values:  `NORMAL`, `SERVERLESS`.
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeParamTemplateDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeParamTemplateDetailResponse(DescribeParamTemplateDetailResponse source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.TemplateDescription != null) {
            this.TemplateDescription = new String(source.TemplateDescription);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Items != null) {
            this.Items = new ParamDetail[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new ParamDetail(source.Items[i]);
            }
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "TemplateDescription", this.TemplateDescription);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

