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

public class CreateSecurityPolicyRequest extends AbstractModel {

    /**
    * <p>List of encryption suites supported by the security policy. Encryption suites are used to negotiate the encryption algorithm between client and server.</p><p><strong>Configuration instructions:</strong></p><ul><li>The optional range of encryption suites depends on the selected TLS protocol version (TLSVersions parameter).</li><li>An encryption suite can be added to the list as long as it is supported by any one of the selected TLS versions.</li><li>If TLSVersions includes TLSv1.3: you can add TLSv1.3 exclusive encryption suites without specifying them (the system will auto-complete all TLSv1.3 suites); if specified, all TLSv1.3 exclusive encryption suites must be included. Specifying only part of them is not supported.</li></ul><p><strong>Get available encryption suites:</strong><br>Call the <a href="https://www.tencentcloud.com/document/api/1822/133718?from_cn_redirect=1">DescribeSecurityPolicyCapabilities</a> API to query the encryption suite list supported by each TLS version.</p>
    */
    @SerializedName("Ciphers")
    @Expose
    private String [] Ciphers;

    /**
    * <p>List of TLS protocol versions supported by the security policy. TLS (Transport Layer Security) is used to ensure communication security between clients and load balancing.</p><p><strong>Available values:</strong></p><ul><li><strong>TLSv1.0</strong>: Best compatibility, but low security level. Not recommended for production environment.</li><li><strong>TLSv1.1</strong>: Slightly better security than TLSv1.0, but still not recommended.</li><li><strong>TLSv1.2</strong>: Current mainstream security protocol version, balancing security and compatibility.</li><li><strong>TLSv1.3</strong>: Latest version with the highest security and better performance. Recommended for priority use.</li></ul><p><strong>Recommendation:</strong> For production environment, at least select TLSv1.2. If client support is available, preferentially enable TLSv1.3.</p>
    */
    @SerializedName("TLSVersions")
    @Expose
    private String [] TLSVersions;

    /**
    * <p>Client idempotency token.</p><p>Used for ensuring request idempotency and preventing duplicate creation caused by network timeout or client retry. We recommend using a UUID as the token value. When the same ClientToken is used for repeated requests within its validity period, the server will return the same result.</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>Whether to only execute a preflight request. Values:</p><ul><li><strong>true</strong>: Only execute a preflight request without creating resources. The preflight request will verify parameter format, permission, and resource quota, helping you identify potential issues before proceeding with any operations.</li><li><strong>false</strong> (default): Execute a normal request. After the preflight passes, a security policy will be created directly.</li></ul>
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * <p>security policy name. Used to identify and distinguish different security policies.</p><p><strong>Naming rule:</strong></p><ul><li>2–128 characters in length.</li><li>Must start with English letters or Chinese characters.</li><li>Can contain English letters, Chinese characters, digits, half-width periods (.), underscores (_), and dashes (-).</li></ul><p><strong>Recommendation:</strong> Use a name with business meaning, such as "prod-high-security" or "test environment policy".</p>
    */
    @SerializedName("SecurityPolicyName")
    @Expose
    private String SecurityPolicyName;

    /**
    * <p>Tag list of the security policy. Tags are used for resource classification and management, making it easy to filter and organize resources by business, environment, department, and other dimensions.</p><p>Each tag consists of a Key-Value pair, and tag keys cannot be repeated under the same resource.</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get <p>List of encryption suites supported by the security policy. Encryption suites are used to negotiate the encryption algorithm between client and server.</p><p><strong>Configuration instructions:</strong></p><ul><li>The optional range of encryption suites depends on the selected TLS protocol version (TLSVersions parameter).</li><li>An encryption suite can be added to the list as long as it is supported by any one of the selected TLS versions.</li><li>If TLSVersions includes TLSv1.3: you can add TLSv1.3 exclusive encryption suites without specifying them (the system will auto-complete all TLSv1.3 suites); if specified, all TLSv1.3 exclusive encryption suites must be included. Specifying only part of them is not supported.</li></ul><p><strong>Get available encryption suites:</strong><br>Call the <a href="https://www.tencentcloud.com/document/api/1822/133718?from_cn_redirect=1">DescribeSecurityPolicyCapabilities</a> API to query the encryption suite list supported by each TLS version.</p> 
     * @return Ciphers <p>List of encryption suites supported by the security policy. Encryption suites are used to negotiate the encryption algorithm between client and server.</p><p><strong>Configuration instructions:</strong></p><ul><li>The optional range of encryption suites depends on the selected TLS protocol version (TLSVersions parameter).</li><li>An encryption suite can be added to the list as long as it is supported by any one of the selected TLS versions.</li><li>If TLSVersions includes TLSv1.3: you can add TLSv1.3 exclusive encryption suites without specifying them (the system will auto-complete all TLSv1.3 suites); if specified, all TLSv1.3 exclusive encryption suites must be included. Specifying only part of them is not supported.</li></ul><p><strong>Get available encryption suites:</strong><br>Call the <a href="https://www.tencentcloud.com/document/api/1822/133718?from_cn_redirect=1">DescribeSecurityPolicyCapabilities</a> API to query the encryption suite list supported by each TLS version.</p>
     */
    public String [] getCiphers() {
        return this.Ciphers;
    }

    /**
     * Set <p>List of encryption suites supported by the security policy. Encryption suites are used to negotiate the encryption algorithm between client and server.</p><p><strong>Configuration instructions:</strong></p><ul><li>The optional range of encryption suites depends on the selected TLS protocol version (TLSVersions parameter).</li><li>An encryption suite can be added to the list as long as it is supported by any one of the selected TLS versions.</li><li>If TLSVersions includes TLSv1.3: you can add TLSv1.3 exclusive encryption suites without specifying them (the system will auto-complete all TLSv1.3 suites); if specified, all TLSv1.3 exclusive encryption suites must be included. Specifying only part of them is not supported.</li></ul><p><strong>Get available encryption suites:</strong><br>Call the <a href="https://www.tencentcloud.com/document/api/1822/133718?from_cn_redirect=1">DescribeSecurityPolicyCapabilities</a> API to query the encryption suite list supported by each TLS version.</p>
     * @param Ciphers <p>List of encryption suites supported by the security policy. Encryption suites are used to negotiate the encryption algorithm between client and server.</p><p><strong>Configuration instructions:</strong></p><ul><li>The optional range of encryption suites depends on the selected TLS protocol version (TLSVersions parameter).</li><li>An encryption suite can be added to the list as long as it is supported by any one of the selected TLS versions.</li><li>If TLSVersions includes TLSv1.3: you can add TLSv1.3 exclusive encryption suites without specifying them (the system will auto-complete all TLSv1.3 suites); if specified, all TLSv1.3 exclusive encryption suites must be included. Specifying only part of them is not supported.</li></ul><p><strong>Get available encryption suites:</strong><br>Call the <a href="https://www.tencentcloud.com/document/api/1822/133718?from_cn_redirect=1">DescribeSecurityPolicyCapabilities</a> API to query the encryption suite list supported by each TLS version.</p>
     */
    public void setCiphers(String [] Ciphers) {
        this.Ciphers = Ciphers;
    }

    /**
     * Get <p>List of TLS protocol versions supported by the security policy. TLS (Transport Layer Security) is used to ensure communication security between clients and load balancing.</p><p><strong>Available values:</strong></p><ul><li><strong>TLSv1.0</strong>: Best compatibility, but low security level. Not recommended for production environment.</li><li><strong>TLSv1.1</strong>: Slightly better security than TLSv1.0, but still not recommended.</li><li><strong>TLSv1.2</strong>: Current mainstream security protocol version, balancing security and compatibility.</li><li><strong>TLSv1.3</strong>: Latest version with the highest security and better performance. Recommended for priority use.</li></ul><p><strong>Recommendation:</strong> For production environment, at least select TLSv1.2. If client support is available, preferentially enable TLSv1.3.</p> 
     * @return TLSVersions <p>List of TLS protocol versions supported by the security policy. TLS (Transport Layer Security) is used to ensure communication security between clients and load balancing.</p><p><strong>Available values:</strong></p><ul><li><strong>TLSv1.0</strong>: Best compatibility, but low security level. Not recommended for production environment.</li><li><strong>TLSv1.1</strong>: Slightly better security than TLSv1.0, but still not recommended.</li><li><strong>TLSv1.2</strong>: Current mainstream security protocol version, balancing security and compatibility.</li><li><strong>TLSv1.3</strong>: Latest version with the highest security and better performance. Recommended for priority use.</li></ul><p><strong>Recommendation:</strong> For production environment, at least select TLSv1.2. If client support is available, preferentially enable TLSv1.3.</p>
     */
    public String [] getTLSVersions() {
        return this.TLSVersions;
    }

    /**
     * Set <p>List of TLS protocol versions supported by the security policy. TLS (Transport Layer Security) is used to ensure communication security between clients and load balancing.</p><p><strong>Available values:</strong></p><ul><li><strong>TLSv1.0</strong>: Best compatibility, but low security level. Not recommended for production environment.</li><li><strong>TLSv1.1</strong>: Slightly better security than TLSv1.0, but still not recommended.</li><li><strong>TLSv1.2</strong>: Current mainstream security protocol version, balancing security and compatibility.</li><li><strong>TLSv1.3</strong>: Latest version with the highest security and better performance. Recommended for priority use.</li></ul><p><strong>Recommendation:</strong> For production environment, at least select TLSv1.2. If client support is available, preferentially enable TLSv1.3.</p>
     * @param TLSVersions <p>List of TLS protocol versions supported by the security policy. TLS (Transport Layer Security) is used to ensure communication security between clients and load balancing.</p><p><strong>Available values:</strong></p><ul><li><strong>TLSv1.0</strong>: Best compatibility, but low security level. Not recommended for production environment.</li><li><strong>TLSv1.1</strong>: Slightly better security than TLSv1.0, but still not recommended.</li><li><strong>TLSv1.2</strong>: Current mainstream security protocol version, balancing security and compatibility.</li><li><strong>TLSv1.3</strong>: Latest version with the highest security and better performance. Recommended for priority use.</li></ul><p><strong>Recommendation:</strong> For production environment, at least select TLSv1.2. If client support is available, preferentially enable TLSv1.3.</p>
     */
    public void setTLSVersions(String [] TLSVersions) {
        this.TLSVersions = TLSVersions;
    }

    /**
     * Get <p>Client idempotency token.</p><p>Used for ensuring request idempotency and preventing duplicate creation caused by network timeout or client retry. We recommend using a UUID as the token value. When the same ClientToken is used for repeated requests within its validity period, the server will return the same result.</p> 
     * @return ClientToken <p>Client idempotency token.</p><p>Used for ensuring request idempotency and preventing duplicate creation caused by network timeout or client retry. We recommend using a UUID as the token value. When the same ClientToken is used for repeated requests within its validity period, the server will return the same result.</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>Client idempotency token.</p><p>Used for ensuring request idempotency and preventing duplicate creation caused by network timeout or client retry. We recommend using a UUID as the token value. When the same ClientToken is used for repeated requests within its validity period, the server will return the same result.</p>
     * @param ClientToken <p>Client idempotency token.</p><p>Used for ensuring request idempotency and preventing duplicate creation caused by network timeout or client retry. We recommend using a UUID as the token value. When the same ClientToken is used for repeated requests within its validity period, the server will return the same result.</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>Whether to only execute a preflight request. Values:</p><ul><li><strong>true</strong>: Only execute a preflight request without creating resources. The preflight request will verify parameter format, permission, and resource quota, helping you identify potential issues before proceeding with any operations.</li><li><strong>false</strong> (default): Execute a normal request. After the preflight passes, a security policy will be created directly.</li></ul> 
     * @return DryRun <p>Whether to only execute a preflight request. Values:</p><ul><li><strong>true</strong>: Only execute a preflight request without creating resources. The preflight request will verify parameter format, permission, and resource quota, helping you identify potential issues before proceeding with any operations.</li><li><strong>false</strong> (default): Execute a normal request. After the preflight passes, a security policy will be created directly.</li></ul>
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set <p>Whether to only execute a preflight request. Values:</p><ul><li><strong>true</strong>: Only execute a preflight request without creating resources. The preflight request will verify parameter format, permission, and resource quota, helping you identify potential issues before proceeding with any operations.</li><li><strong>false</strong> (default): Execute a normal request. After the preflight passes, a security policy will be created directly.</li></ul>
     * @param DryRun <p>Whether to only execute a preflight request. Values:</p><ul><li><strong>true</strong>: Only execute a preflight request without creating resources. The preflight request will verify parameter format, permission, and resource quota, helping you identify potential issues before proceeding with any operations.</li><li><strong>false</strong> (default): Execute a normal request. After the preflight passes, a security policy will be created directly.</li></ul>
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get <p>security policy name. Used to identify and distinguish different security policies.</p><p><strong>Naming rule:</strong></p><ul><li>2–128 characters in length.</li><li>Must start with English letters or Chinese characters.</li><li>Can contain English letters, Chinese characters, digits, half-width periods (.), underscores (_), and dashes (-).</li></ul><p><strong>Recommendation:</strong> Use a name with business meaning, such as "prod-high-security" or "test environment policy".</p> 
     * @return SecurityPolicyName <p>security policy name. Used to identify and distinguish different security policies.</p><p><strong>Naming rule:</strong></p><ul><li>2–128 characters in length.</li><li>Must start with English letters or Chinese characters.</li><li>Can contain English letters, Chinese characters, digits, half-width periods (.), underscores (_), and dashes (-).</li></ul><p><strong>Recommendation:</strong> Use a name with business meaning, such as "prod-high-security" or "test environment policy".</p>
     */
    public String getSecurityPolicyName() {
        return this.SecurityPolicyName;
    }

    /**
     * Set <p>security policy name. Used to identify and distinguish different security policies.</p><p><strong>Naming rule:</strong></p><ul><li>2–128 characters in length.</li><li>Must start with English letters or Chinese characters.</li><li>Can contain English letters, Chinese characters, digits, half-width periods (.), underscores (_), and dashes (-).</li></ul><p><strong>Recommendation:</strong> Use a name with business meaning, such as "prod-high-security" or "test environment policy".</p>
     * @param SecurityPolicyName <p>security policy name. Used to identify and distinguish different security policies.</p><p><strong>Naming rule:</strong></p><ul><li>2–128 characters in length.</li><li>Must start with English letters or Chinese characters.</li><li>Can contain English letters, Chinese characters, digits, half-width periods (.), underscores (_), and dashes (-).</li></ul><p><strong>Recommendation:</strong> Use a name with business meaning, such as "prod-high-security" or "test environment policy".</p>
     */
    public void setSecurityPolicyName(String SecurityPolicyName) {
        this.SecurityPolicyName = SecurityPolicyName;
    }

    /**
     * Get <p>Tag list of the security policy. Tags are used for resource classification and management, making it easy to filter and organize resources by business, environment, department, and other dimensions.</p><p>Each tag consists of a Key-Value pair, and tag keys cannot be repeated under the same resource.</p> 
     * @return Tags <p>Tag list of the security policy. Tags are used for resource classification and management, making it easy to filter and organize resources by business, environment, department, and other dimensions.</p><p>Each tag consists of a Key-Value pair, and tag keys cannot be repeated under the same resource.</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag list of the security policy. Tags are used for resource classification and management, making it easy to filter and organize resources by business, environment, department, and other dimensions.</p><p>Each tag consists of a Key-Value pair, and tag keys cannot be repeated under the same resource.</p>
     * @param Tags <p>Tag list of the security policy. Tags are used for resource classification and management, making it easy to filter and organize resources by business, environment, department, and other dimensions.</p><p>Each tag consists of a Key-Value pair, and tag keys cannot be repeated under the same resource.</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public CreateSecurityPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSecurityPolicyRequest(CreateSecurityPolicyRequest source) {
        if (source.Ciphers != null) {
            this.Ciphers = new String[source.Ciphers.length];
            for (int i = 0; i < source.Ciphers.length; i++) {
                this.Ciphers[i] = new String(source.Ciphers[i]);
            }
        }
        if (source.TLSVersions != null) {
            this.TLSVersions = new String[source.TLSVersions.length];
            for (int i = 0; i < source.TLSVersions.length; i++) {
                this.TLSVersions[i] = new String(source.TLSVersions[i]);
            }
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.SecurityPolicyName != null) {
            this.SecurityPolicyName = new String(source.SecurityPolicyName);
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
        this.setParamArraySimple(map, prefix + "TLSVersions.", this.TLSVersions);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "SecurityPolicyName", this.SecurityPolicyName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

