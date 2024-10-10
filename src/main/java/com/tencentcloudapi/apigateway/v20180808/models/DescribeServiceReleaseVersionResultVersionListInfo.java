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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServiceReleaseVersionResultVersionListInfo extends AbstractModel {

    /**
    * Version ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * Version description. 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VersionDesc")
    @Expose
    private String VersionDesc;

    /**
     * Get Version ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VersionName Version ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set Version ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VersionName Version ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get Version description. 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VersionDesc Version description. 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVersionDesc() {
        return this.VersionDesc;
    }

    /**
     * Set Version description. 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VersionDesc Version description. 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVersionDesc(String VersionDesc) {
        this.VersionDesc = VersionDesc;
    }

    public DescribeServiceReleaseVersionResultVersionListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServiceReleaseVersionResultVersionListInfo(DescribeServiceReleaseVersionResultVersionListInfo source) {
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.VersionDesc != null) {
            this.VersionDesc = new String(source.VersionDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "VersionDesc", this.VersionDesc);

    }
}

