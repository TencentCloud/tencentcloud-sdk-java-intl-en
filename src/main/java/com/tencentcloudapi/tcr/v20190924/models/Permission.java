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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Permission extends AbstractModel {

    /**
    * Resource path. Valid value: `Namespace`
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * Actions. Currently only support: tcr:PushRepository, tcr:PullRepository, tcr:CreateRepository, tcr:CreateHelmChart, tcr:DescribeHelmCharts.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Actions")
    @Expose
    private String [] Actions;

    /**
     * Get Resource path. Valid value: `Namespace`
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Resource Resource path. Valid value: `Namespace`
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Resource path. Valid value: `Namespace`
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Resource Resource path. Valid value: `Namespace`
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Actions. Currently only support: tcr:PushRepository, tcr:PullRepository, tcr:CreateRepository, tcr:CreateHelmChart, tcr:DescribeHelmCharts.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Actions Actions. Currently only support: tcr:PushRepository, tcr:PullRepository, tcr:CreateRepository, tcr:CreateHelmChart, tcr:DescribeHelmCharts.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getActions() {
        return this.Actions;
    }

    /**
     * Set Actions. Currently only support: tcr:PushRepository, tcr:PullRepository, tcr:CreateRepository, tcr:CreateHelmChart, tcr:DescribeHelmCharts.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Actions Actions. Currently only support: tcr:PushRepository, tcr:PullRepository, tcr:CreateRepository, tcr:CreateHelmChart, tcr:DescribeHelmCharts.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setActions(String [] Actions) {
        this.Actions = Actions;
    }

    public Permission() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Permission(Permission source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.Actions != null) {
            this.Actions = new String[source.Actions.length];
            for (int i = 0; i < source.Actions.length; i++) {
                this.Actions[i] = new String(source.Actions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamArraySimple(map, prefix + "Actions.", this.Actions);

    }
}

