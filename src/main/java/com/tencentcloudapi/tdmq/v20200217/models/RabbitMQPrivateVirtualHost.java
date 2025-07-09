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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQPrivateVirtualHost extends AbstractModel {

    /**
    * Vhost name
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VirtualHostName")
    @Expose
    private String VirtualHostName;

    /**
    * Vhost description
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Vhost name
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return VirtualHostName Vhost name
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getVirtualHostName() {
        return this.VirtualHostName;
    }

    /**
     * Set Vhost name
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param VirtualHostName Vhost name
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setVirtualHostName(String VirtualHostName) {
        this.VirtualHostName = VirtualHostName;
    }

    /**
     * Get Vhost description
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return Description Vhost description
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Vhost description
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param Description Vhost description
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public RabbitMQPrivateVirtualHost() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQPrivateVirtualHost(RabbitMQPrivateVirtualHost source) {
        if (source.VirtualHostName != null) {
            this.VirtualHostName = new String(source.VirtualHostName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VirtualHostName", this.VirtualHostName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

