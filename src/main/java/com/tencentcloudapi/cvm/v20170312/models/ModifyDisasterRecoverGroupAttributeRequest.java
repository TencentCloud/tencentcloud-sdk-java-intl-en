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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDisasterRecoverGroupAttributeRequest extends AbstractModel{

    /**
    * Spread placement group ID, which can be obtained by calling the [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810) API.
    */
    @SerializedName("DisasterRecoverGroupId")
    @Expose
    private String DisasterRecoverGroupId;

    /**
    * Name of a spread placement group. The name must be 1-60 characters long and can contain both Chinese characters and English letters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Spread placement group ID, which can be obtained by calling the [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810) API. 
     * @return DisasterRecoverGroupId Spread placement group ID, which can be obtained by calling the [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810) API.
     */
    public String getDisasterRecoverGroupId() {
        return this.DisasterRecoverGroupId;
    }

    /**
     * Set Spread placement group ID, which can be obtained by calling the [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810) API.
     * @param DisasterRecoverGroupId Spread placement group ID, which can be obtained by calling the [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810) API.
     */
    public void setDisasterRecoverGroupId(String DisasterRecoverGroupId) {
        this.DisasterRecoverGroupId = DisasterRecoverGroupId;
    }

    /**
     * Get Name of a spread placement group. The name must be 1-60 characters long and can contain both Chinese characters and English letters. 
     * @return Name Name of a spread placement group. The name must be 1-60 characters long and can contain both Chinese characters and English letters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of a spread placement group. The name must be 1-60 characters long and can contain both Chinese characters and English letters.
     * @param Name Name of a spread placement group. The name must be 1-60 characters long and can contain both Chinese characters and English letters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisasterRecoverGroupId", this.DisasterRecoverGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

