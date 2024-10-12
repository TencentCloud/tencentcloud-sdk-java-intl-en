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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFunctionRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Function name, which can contain up to 30 characters, including lowercase letters, digits, and hyphens. It should start and end with a digit or a letter.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Function content, which currently only supports JavaScript code. Its maximum size is 5 MB.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Function description, which can contain up to 60 characters.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

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
     * Get Function name, which can contain up to 30 characters, including lowercase letters, digits, and hyphens. It should start and end with a digit or a letter. 
     * @return Name Function name, which can contain up to 30 characters, including lowercase letters, digits, and hyphens. It should start and end with a digit or a letter.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Function name, which can contain up to 30 characters, including lowercase letters, digits, and hyphens. It should start and end with a digit or a letter.
     * @param Name Function name, which can contain up to 30 characters, including lowercase letters, digits, and hyphens. It should start and end with a digit or a letter.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Function content, which currently only supports JavaScript code. Its maximum size is 5 MB. 
     * @return Content Function content, which currently only supports JavaScript code. Its maximum size is 5 MB.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Function content, which currently only supports JavaScript code. Its maximum size is 5 MB.
     * @param Content Function content, which currently only supports JavaScript code. Its maximum size is 5 MB.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Function description, which can contain up to 60 characters. 
     * @return Remark Function description, which can contain up to 60 characters.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Function description, which can contain up to 60 characters.
     * @param Remark Function description, which can contain up to 60 characters.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFunctionRequest(CreateFunctionRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

