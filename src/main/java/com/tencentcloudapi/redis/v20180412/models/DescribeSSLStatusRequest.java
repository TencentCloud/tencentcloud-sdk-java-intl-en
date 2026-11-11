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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSSLStatusRequest extends AbstractModel {

    /**
    * <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy it from the instance list.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Certificate download format type. Defaults to nginx if not passed. Only applicable to custom certificates (CertSource=1)</p><p>Enumeration values:</p><ul><li>nginx: nginx available</li><li>apache: apache available</li><li>tomcat: tomcat available</li><li>iis: iis available</li></ul>
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
     * Get <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy it from the instance list.</p> 
     * @return InstanceId <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy it from the instance list.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy it from the instance list.</p>
     * @param InstanceId <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy it from the instance list.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Certificate download format type. Defaults to nginx if not passed. Only applicable to custom certificates (CertSource=1)</p><p>Enumeration values:</p><ul><li>nginx: nginx available</li><li>apache: apache available</li><li>tomcat: tomcat available</li><li>iis: iis available</li></ul> 
     * @return ServiceType <p>Certificate download format type. Defaults to nginx if not passed. Only applicable to custom certificates (CertSource=1)</p><p>Enumeration values:</p><ul><li>nginx: nginx available</li><li>apache: apache available</li><li>tomcat: tomcat available</li><li>iis: iis available</li></ul>
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>Certificate download format type. Defaults to nginx if not passed. Only applicable to custom certificates (CertSource=1)</p><p>Enumeration values:</p><ul><li>nginx: nginx available</li><li>apache: apache available</li><li>tomcat: tomcat available</li><li>iis: iis available</li></ul>
     * @param ServiceType <p>Certificate download format type. Defaults to nginx if not passed. Only applicable to custom certificates (CertSource=1)</p><p>Enumeration values:</p><ul><li>nginx: nginx available</li><li>apache: apache available</li><li>tomcat: tomcat available</li><li>iis: iis available</li></ul>
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    public DescribeSSLStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSSLStatusRequest(DescribeSSLStatusRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);

    }
}

