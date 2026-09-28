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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityPolicyInfo extends AbstractModel {

    /**
    * List of supported cipher suites.
Supported encryption suite, which depends on the TLSVersions value.
Cipher only needs to be supported by any passed-in TLSVersions.

Description: If TLSv1.3 is selected, the Cipher list must contain ciphers supported by TLSv1.3.

Call the DescribeSecurityPolicyCapabilities API to get the supported encryption suite list.
    */
    @SerializedName("Ciphers")
    @Expose
    private String [] Ciphers;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Security policy ID, format: tls- followed by 8 alphanumeric characters.
    */
    @SerializedName("SecurityPolicyId")
    @Expose
    private String SecurityPolicyId;

    /**
    * Security policy name. It must be 2-128 English or Chinese characters, starting with letters or Chinese characters. It can consist of digits, half-width periods (.), underscores (_), and dashes (-).
    */
    @SerializedName("SecurityPolicyName")
    @Expose
    private String SecurityPolicyName;

    /**
    * Security policy status. The current API most often returns Active, which means the security policy is in available status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * List of supported TLS protocol versions. Optional values include: TLSv1.0, TLSv1.1, TLSv1.2, TLSv1.3.
    */
    @SerializedName("TLSVersions")
    @Expose
    private String [] TLSVersions;

    /**
    * Tag information.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get List of supported cipher suites.
Supported encryption suite, which depends on the TLSVersions value.
Cipher only needs to be supported by any passed-in TLSVersions.

Description: If TLSv1.3 is selected, the Cipher list must contain ciphers supported by TLSv1.3.

Call the DescribeSecurityPolicyCapabilities API to get the supported encryption suite list. 
     * @return Ciphers List of supported cipher suites.
Supported encryption suite, which depends on the TLSVersions value.
Cipher only needs to be supported by any passed-in TLSVersions.

Description: If TLSv1.3 is selected, the Cipher list must contain ciphers supported by TLSv1.3.

Call the DescribeSecurityPolicyCapabilities API to get the supported encryption suite list.
     */
    public String [] getCiphers() {
        return this.Ciphers;
    }

    /**
     * Set List of supported cipher suites.
Supported encryption suite, which depends on the TLSVersions value.
Cipher only needs to be supported by any passed-in TLSVersions.

Description: If TLSv1.3 is selected, the Cipher list must contain ciphers supported by TLSv1.3.

Call the DescribeSecurityPolicyCapabilities API to get the supported encryption suite list.
     * @param Ciphers List of supported cipher suites.
Supported encryption suite, which depends on the TLSVersions value.
Cipher only needs to be supported by any passed-in TLSVersions.

Description: If TLSv1.3 is selected, the Cipher list must contain ciphers supported by TLSv1.3.

Call the DescribeSecurityPolicyCapabilities API to get the supported encryption suite list.
     */
    public void setCiphers(String [] Ciphers) {
        this.Ciphers = Ciphers;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Security policy ID, format: tls- followed by 8 alphanumeric characters. 
     * @return SecurityPolicyId Security policy ID, format: tls- followed by 8 alphanumeric characters.
     */
    public String getSecurityPolicyId() {
        return this.SecurityPolicyId;
    }

    /**
     * Set Security policy ID, format: tls- followed by 8 alphanumeric characters.
     * @param SecurityPolicyId Security policy ID, format: tls- followed by 8 alphanumeric characters.
     */
    public void setSecurityPolicyId(String SecurityPolicyId) {
        this.SecurityPolicyId = SecurityPolicyId;
    }

    /**
     * Get Security policy name. It must be 2-128 English or Chinese characters, starting with letters or Chinese characters. It can consist of digits, half-width periods (.), underscores (_), and dashes (-). 
     * @return SecurityPolicyName Security policy name. It must be 2-128 English or Chinese characters, starting with letters or Chinese characters. It can consist of digits, half-width periods (.), underscores (_), and dashes (-).
     */
    public String getSecurityPolicyName() {
        return this.SecurityPolicyName;
    }

    /**
     * Set Security policy name. It must be 2-128 English or Chinese characters, starting with letters or Chinese characters. It can consist of digits, half-width periods (.), underscores (_), and dashes (-).
     * @param SecurityPolicyName Security policy name. It must be 2-128 English or Chinese characters, starting with letters or Chinese characters. It can consist of digits, half-width periods (.), underscores (_), and dashes (-).
     */
    public void setSecurityPolicyName(String SecurityPolicyName) {
        this.SecurityPolicyName = SecurityPolicyName;
    }

    /**
     * Get Security policy status. The current API most often returns Active, which means the security policy is in available status. 
     * @return Status Security policy status. The current API most often returns Active, which means the security policy is in available status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Security policy status. The current API most often returns Active, which means the security policy is in available status.
     * @param Status Security policy status. The current API most often returns Active, which means the security policy is in available status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get List of supported TLS protocol versions. Optional values include: TLSv1.0, TLSv1.1, TLSv1.2, TLSv1.3. 
     * @return TLSVersions List of supported TLS protocol versions. Optional values include: TLSv1.0, TLSv1.1, TLSv1.2, TLSv1.3.
     */
    public String [] getTLSVersions() {
        return this.TLSVersions;
    }

    /**
     * Set List of supported TLS protocol versions. Optional values include: TLSv1.0, TLSv1.1, TLSv1.2, TLSv1.3.
     * @param TLSVersions List of supported TLS protocol versions. Optional values include: TLSv1.0, TLSv1.1, TLSv1.2, TLSv1.3.
     */
    public void setTLSVersions(String [] TLSVersions) {
        this.TLSVersions = TLSVersions;
    }

    /**
     * Get Tag information. 
     * @return Tags Tag information.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag information.
     * @param Tags Tag information.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public SecurityPolicyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityPolicyInfo(SecurityPolicyInfo source) {
        if (source.Ciphers != null) {
            this.Ciphers = new String[source.Ciphers.length];
            for (int i = 0; i < source.Ciphers.length; i++) {
                this.Ciphers[i] = new String(source.Ciphers[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SecurityPolicyId != null) {
            this.SecurityPolicyId = new String(source.SecurityPolicyId);
        }
        if (source.SecurityPolicyName != null) {
            this.SecurityPolicyName = new String(source.SecurityPolicyName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TLSVersions != null) {
            this.TLSVersions = new String[source.TLSVersions.length];
            for (int i = 0; i < source.TLSVersions.length; i++) {
                this.TLSVersions[i] = new String(source.TLSVersions[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ciphers.", this.Ciphers);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SecurityPolicyId", this.SecurityPolicyId);
        this.setParamSimple(map, prefix + "SecurityPolicyName", this.SecurityPolicyName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "TLSVersions.", this.TLSVersions);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

