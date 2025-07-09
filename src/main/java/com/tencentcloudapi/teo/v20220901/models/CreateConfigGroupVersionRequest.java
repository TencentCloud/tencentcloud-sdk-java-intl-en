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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateConfigGroupVersionRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * GroupId of the version to be created.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Configuration content to be imported. It is required to be in JSON format and encoded in UTF-8. Please refer to the example below for the configuration file content.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Version description. The maximum length allowed is 50 characters. This field can be used to provide details about the application scenarios of this version.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get GroupId of the version to be created. 
     * @return GroupId GroupId of the version to be created.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set GroupId of the version to be created.
     * @param GroupId GroupId of the version to be created.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Configuration content to be imported. It is required to be in JSON format and encoded in UTF-8. Please refer to the example below for the configuration file content. 
     * @return Content Configuration content to be imported. It is required to be in JSON format and encoded in UTF-8. Please refer to the example below for the configuration file content.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Configuration content to be imported. It is required to be in JSON format and encoded in UTF-8. Please refer to the example below for the configuration file content.
     * @param Content Configuration content to be imported. It is required to be in JSON format and encoded in UTF-8. Please refer to the example below for the configuration file content.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Version description. The maximum length allowed is 50 characters. This field can be used to provide details about the application scenarios of this version. 
     * @return Description Version description. The maximum length allowed is 50 characters. This field can be used to provide details about the application scenarios of this version.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Version description. The maximum length allowed is 50 characters. This field can be used to provide details about the application scenarios of this version.
     * @param Description Version description. The maximum length allowed is 50 characters. This field can be used to provide details about the application scenarios of this version.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateConfigGroupVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConfigGroupVersionRequest(CreateConfigGroupVersionRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

