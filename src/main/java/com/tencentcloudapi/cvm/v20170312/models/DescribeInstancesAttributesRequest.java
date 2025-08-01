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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesAttributesRequest extends AbstractModel {

    /**
    * Instance attributes to be obtained. Valid value(s): 
UserData: Custom data of instances.
    */
    @SerializedName("Attributes")
    @Expose
    private String [] Attributes;

    /**
    * Instance ID list.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * Get Instance attributes to be obtained. Valid value(s): 
UserData: Custom data of instances. 
     * @return Attributes Instance attributes to be obtained. Valid value(s): 
UserData: Custom data of instances.
     */
    public String [] getAttributes() {
        return this.Attributes;
    }

    /**
     * Set Instance attributes to be obtained. Valid value(s): 
UserData: Custom data of instances.
     * @param Attributes Instance attributes to be obtained. Valid value(s): 
UserData: Custom data of instances.
     */
    public void setAttributes(String [] Attributes) {
        this.Attributes = Attributes;
    }

    /**
     * Get Instance ID list. 
     * @return InstanceIds Instance ID list.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID list.
     * @param InstanceIds Instance ID list.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    public DescribeInstancesAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesAttributesRequest(DescribeInstancesAttributesRequest source) {
        if (source.Attributes != null) {
            this.Attributes = new String[source.Attributes.length];
            for (int i = 0; i < source.Attributes.length; i++) {
                this.Attributes[i] = new String(source.Attributes[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Attributes.", this.Attributes);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

