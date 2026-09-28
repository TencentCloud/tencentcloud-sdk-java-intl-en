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

public class ModifySecurityPolicyAttributesRequest extends AbstractModel {

    /**
    * <p>Security policy ID, format: tls- followed by 8 alphanumeric characters.</p>
    */
    @SerializedName("SecurityPolicyId")
    @Expose
    private String SecurityPolicyId;

    /**
    * <p>Modified encryption suite list. The encryption suite is used to negotiate the encryption algorithm between client and server.</p><p><strong>Configuration instructions:</strong></p><ul><li>The optional range of encryption suites depends on the selected TLS protocol version (TLSVersions parameter).</li><li>As long as an encryption suite is supported by any one of the selected TLS versions, it can be added to the list.</li><li>If TLSVersions contains TLSv1.3: TLSv1.3 exclusive encryption suites can be unspecified (the system will auto-complete all TLSv1.3 suites); if specified, all TLSv1.3 exclusive encryption suites must be included. Specifying only part is not supported.</li></ul><p><strong>Get available encryption suites:</strong><br>Call the <a href="https://www.tencentcloud.com/document/api/1822/133718?from_cn_redirect=1">DescribeSecurityPolicyCapabilities</a> API to query the encryption suite list supported by each TLS version.</p><p><strong>Note:</strong> If this parameter is not specified, the original configuration remains unchanged.</p>
    */
    @SerializedName("Ciphers")
    @Expose
    private String [] Ciphers;

    /**
    * <p>Whether to only execute a preflight request. Values:</p><ul><li><strong>true</strong>: Only execute a preflight request without actually modifying resources. The preflight request will verify parameter format, permission, and configuration validity, helping you identify potential issues before proceeding with any operations.</li><li><strong>false</strong> (default): Execute a normal request. After passing the preflight, the security policy will be directly modified.</li></ul>
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * <p>Modified security policy name, used to identify and distinguish different security policies.</p><p><strong>Naming rule:</strong></p><ul><li>Length: 2–128 characters.</li><li>Must start with English letters or Chinese characters.</li><li>Can contain English letters, Chinese characters, digits, half-width periods (.), underscores (_), and dashes (-).</li></ul><p><strong>Note:</strong> If this parameter is not specified, the original name remains unchanged.</p>
    */
    @SerializedName("SecurityPolicyName")
    @Expose
    private String SecurityPolicyName;

    /**
    * <p>List of TLS protocol versions after modification. TLS (Transport Layer Security) is used to guarantee the security of communication between clients and the load balancer.</p><p><strong>Available values:</strong></p><ul><li><strong>TLSv1.0</strong>: Best compatibility, but low security level. Not recommended for production environment.</li><li><strong>TLSv1.1</strong>: Slightly better security than TLSv1.0, but still not recommended.</li><li><strong>TLSv1.2</strong>: Current mainstream security protocol version, balancing security and compatibility.</li><li><strong>TLSv1.3</strong>: Latest version, highest security and better performance. Recommended to prioritize.</li></ul><p><strong>Note:</strong> </p><ul><li>If this parameter is not specified, the original configuration remains unchanged.</li><li>When modifying the TLS version, check whether the Ciphers parameter configuration is compatible.</li></ul>
    */
    @SerializedName("TLSVersions")
    @Expose
    private String [] TLSVersions;

    /**
     * Get <p>Security policy ID, format: tls- followed by 8 alphanumeric characters.</p> 
     * @return SecurityPolicyId <p>Security policy ID, format: tls- followed by 8 alphanumeric characters.</p>
     */
    public String getSecurityPolicyId() {
        return this.SecurityPolicyId;
    }

    /**
     * Set <p>Security policy ID, format: tls- followed by 8 alphanumeric characters.</p>
     * @param SecurityPolicyId <p>Security policy ID, format: tls- followed by 8 alphanumeric characters.</p>
     */
    public void setSecurityPolicyId(String SecurityPolicyId) {
        this.SecurityPolicyId = SecurityPolicyId;
    }

    /**
     * Get <p>Modified encryption suite list. The encryption suite is used to negotiate the encryption algorithm between client and server.</p><p><strong>Configuration instructions:</strong></p><ul><li>The optional range of encryption suites depends on the selected TLS protocol version (TLSVersions parameter).</li><li>As long as an encryption suite is supported by any one of the selected TLS versions, it can be added to the list.</li><li>If TLSVersions contains TLSv1.3: TLSv1.3 exclusive encryption suites can be unspecified (the system will auto-complete all TLSv1.3 suites); if specified, all TLSv1.3 exclusive encryption suites must be included. Specifying only part is not supported.</li></ul><p><strong>Get available encryption suites:</strong><br>Call the <a href="https://www.tencentcloud.com/document/api/1822/133718?from_cn_redirect=1">DescribeSecurityPolicyCapabilities</a> API to query the encryption suite list supported by each TLS version.</p><p><strong>Note:</strong> If this parameter is not specified, the original configuration remains unchanged.</p> 
     * @return Ciphers <p>Modified encryption suite list. The encryption suite is used to negotiate the encryption algorithm between client and server.</p><p><strong>Configuration instructions:</strong></p><ul><li>The optional range of encryption suites depends on the selected TLS protocol version (TLSVersions parameter).</li><li>As long as an encryption suite is supported by any one of the selected TLS versions, it can be added to the list.</li><li>If TLSVersions contains TLSv1.3: TLSv1.3 exclusive encryption suites can be unspecified (the system will auto-complete all TLSv1.3 suites); if specified, all TLSv1.3 exclusive encryption suites must be included. Specifying only part is not supported.</li></ul><p><strong>Get available encryption suites:</strong><br>Call the <a href="https://www.tencentcloud.com/document/api/1822/133718?from_cn_redirect=1">DescribeSecurityPolicyCapabilities</a> API to query the encryption suite list supported by each TLS version.</p><p><strong>Note:</strong> If this parameter is not specified, the original configuration remains unchanged.</p>
     */
    public String [] getCiphers() {
        return this.Ciphers;
    }

    /**
     * Set <p>Modified encryption suite list. The encryption suite is used to negotiate the encryption algorithm between client and server.</p><p><strong>Configuration instructions:</strong></p><ul><li>The optional range of encryption suites depends on the selected TLS protocol version (TLSVersions parameter).</li><li>As long as an encryption suite is supported by any one of the selected TLS versions, it can be added to the list.</li><li>If TLSVersions contains TLSv1.3: TLSv1.3 exclusive encryption suites can be unspecified (the system will auto-complete all TLSv1.3 suites); if specified, all TLSv1.3 exclusive encryption suites must be included. Specifying only part is not supported.</li></ul><p><strong>Get available encryption suites:</strong><br>Call the <a href="https://www.tencentcloud.com/document/api/1822/133718?from_cn_redirect=1">DescribeSecurityPolicyCapabilities</a> API to query the encryption suite list supported by each TLS version.</p><p><strong>Note:</strong> If this parameter is not specified, the original configuration remains unchanged.</p>
     * @param Ciphers <p>Modified encryption suite list. The encryption suite is used to negotiate the encryption algorithm between client and server.</p><p><strong>Configuration instructions:</strong></p><ul><li>The optional range of encryption suites depends on the selected TLS protocol version (TLSVersions parameter).</li><li>As long as an encryption suite is supported by any one of the selected TLS versions, it can be added to the list.</li><li>If TLSVersions contains TLSv1.3: TLSv1.3 exclusive encryption suites can be unspecified (the system will auto-complete all TLSv1.3 suites); if specified, all TLSv1.3 exclusive encryption suites must be included. Specifying only part is not supported.</li></ul><p><strong>Get available encryption suites:</strong><br>Call the <a href="https://www.tencentcloud.com/document/api/1822/133718?from_cn_redirect=1">DescribeSecurityPolicyCapabilities</a> API to query the encryption suite list supported by each TLS version.</p><p><strong>Note:</strong> If this parameter is not specified, the original configuration remains unchanged.</p>
     */
    public void setCiphers(String [] Ciphers) {
        this.Ciphers = Ciphers;
    }

    /**
     * Get <p>Whether to only execute a preflight request. Values:</p><ul><li><strong>true</strong>: Only execute a preflight request without actually modifying resources. The preflight request will verify parameter format, permission, and configuration validity, helping you identify potential issues before proceeding with any operations.</li><li><strong>false</strong> (default): Execute a normal request. After passing the preflight, the security policy will be directly modified.</li></ul> 
     * @return DryRun <p>Whether to only execute a preflight request. Values:</p><ul><li><strong>true</strong>: Only execute a preflight request without actually modifying resources. The preflight request will verify parameter format, permission, and configuration validity, helping you identify potential issues before proceeding with any operations.</li><li><strong>false</strong> (default): Execute a normal request. After passing the preflight, the security policy will be directly modified.</li></ul>
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set <p>Whether to only execute a preflight request. Values:</p><ul><li><strong>true</strong>: Only execute a preflight request without actually modifying resources. The preflight request will verify parameter format, permission, and configuration validity, helping you identify potential issues before proceeding with any operations.</li><li><strong>false</strong> (default): Execute a normal request. After passing the preflight, the security policy will be directly modified.</li></ul>
     * @param DryRun <p>Whether to only execute a preflight request. Values:</p><ul><li><strong>true</strong>: Only execute a preflight request without actually modifying resources. The preflight request will verify parameter format, permission, and configuration validity, helping you identify potential issues before proceeding with any operations.</li><li><strong>false</strong> (default): Execute a normal request. After passing the preflight, the security policy will be directly modified.</li></ul>
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get <p>Modified security policy name, used to identify and distinguish different security policies.</p><p><strong>Naming rule:</strong></p><ul><li>Length: 2–128 characters.</li><li>Must start with English letters or Chinese characters.</li><li>Can contain English letters, Chinese characters, digits, half-width periods (.), underscores (_), and dashes (-).</li></ul><p><strong>Note:</strong> If this parameter is not specified, the original name remains unchanged.</p> 
     * @return SecurityPolicyName <p>Modified security policy name, used to identify and distinguish different security policies.</p><p><strong>Naming rule:</strong></p><ul><li>Length: 2–128 characters.</li><li>Must start with English letters or Chinese characters.</li><li>Can contain English letters, Chinese characters, digits, half-width periods (.), underscores (_), and dashes (-).</li></ul><p><strong>Note:</strong> If this parameter is not specified, the original name remains unchanged.</p>
     */
    public String getSecurityPolicyName() {
        return this.SecurityPolicyName;
    }

    /**
     * Set <p>Modified security policy name, used to identify and distinguish different security policies.</p><p><strong>Naming rule:</strong></p><ul><li>Length: 2–128 characters.</li><li>Must start with English letters or Chinese characters.</li><li>Can contain English letters, Chinese characters, digits, half-width periods (.), underscores (_), and dashes (-).</li></ul><p><strong>Note:</strong> If this parameter is not specified, the original name remains unchanged.</p>
     * @param SecurityPolicyName <p>Modified security policy name, used to identify and distinguish different security policies.</p><p><strong>Naming rule:</strong></p><ul><li>Length: 2–128 characters.</li><li>Must start with English letters or Chinese characters.</li><li>Can contain English letters, Chinese characters, digits, half-width periods (.), underscores (_), and dashes (-).</li></ul><p><strong>Note:</strong> If this parameter is not specified, the original name remains unchanged.</p>
     */
    public void setSecurityPolicyName(String SecurityPolicyName) {
        this.SecurityPolicyName = SecurityPolicyName;
    }

    /**
     * Get <p>List of TLS protocol versions after modification. TLS (Transport Layer Security) is used to guarantee the security of communication between clients and the load balancer.</p><p><strong>Available values:</strong></p><ul><li><strong>TLSv1.0</strong>: Best compatibility, but low security level. Not recommended for production environment.</li><li><strong>TLSv1.1</strong>: Slightly better security than TLSv1.0, but still not recommended.</li><li><strong>TLSv1.2</strong>: Current mainstream security protocol version, balancing security and compatibility.</li><li><strong>TLSv1.3</strong>: Latest version, highest security and better performance. Recommended to prioritize.</li></ul><p><strong>Note:</strong> </p><ul><li>If this parameter is not specified, the original configuration remains unchanged.</li><li>When modifying the TLS version, check whether the Ciphers parameter configuration is compatible.</li></ul> 
     * @return TLSVersions <p>List of TLS protocol versions after modification. TLS (Transport Layer Security) is used to guarantee the security of communication between clients and the load balancer.</p><p><strong>Available values:</strong></p><ul><li><strong>TLSv1.0</strong>: Best compatibility, but low security level. Not recommended for production environment.</li><li><strong>TLSv1.1</strong>: Slightly better security than TLSv1.0, but still not recommended.</li><li><strong>TLSv1.2</strong>: Current mainstream security protocol version, balancing security and compatibility.</li><li><strong>TLSv1.3</strong>: Latest version, highest security and better performance. Recommended to prioritize.</li></ul><p><strong>Note:</strong> </p><ul><li>If this parameter is not specified, the original configuration remains unchanged.</li><li>When modifying the TLS version, check whether the Ciphers parameter configuration is compatible.</li></ul>
     */
    public String [] getTLSVersions() {
        return this.TLSVersions;
    }

    /**
     * Set <p>List of TLS protocol versions after modification. TLS (Transport Layer Security) is used to guarantee the security of communication between clients and the load balancer.</p><p><strong>Available values:</strong></p><ul><li><strong>TLSv1.0</strong>: Best compatibility, but low security level. Not recommended for production environment.</li><li><strong>TLSv1.1</strong>: Slightly better security than TLSv1.0, but still not recommended.</li><li><strong>TLSv1.2</strong>: Current mainstream security protocol version, balancing security and compatibility.</li><li><strong>TLSv1.3</strong>: Latest version, highest security and better performance. Recommended to prioritize.</li></ul><p><strong>Note:</strong> </p><ul><li>If this parameter is not specified, the original configuration remains unchanged.</li><li>When modifying the TLS version, check whether the Ciphers parameter configuration is compatible.</li></ul>
     * @param TLSVersions <p>List of TLS protocol versions after modification. TLS (Transport Layer Security) is used to guarantee the security of communication between clients and the load balancer.</p><p><strong>Available values:</strong></p><ul><li><strong>TLSv1.0</strong>: Best compatibility, but low security level. Not recommended for production environment.</li><li><strong>TLSv1.1</strong>: Slightly better security than TLSv1.0, but still not recommended.</li><li><strong>TLSv1.2</strong>: Current mainstream security protocol version, balancing security and compatibility.</li><li><strong>TLSv1.3</strong>: Latest version, highest security and better performance. Recommended to prioritize.</li></ul><p><strong>Note:</strong> </p><ul><li>If this parameter is not specified, the original configuration remains unchanged.</li><li>When modifying the TLS version, check whether the Ciphers parameter configuration is compatible.</li></ul>
     */
    public void setTLSVersions(String [] TLSVersions) {
        this.TLSVersions = TLSVersions;
    }

    public ModifySecurityPolicyAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecurityPolicyAttributesRequest(ModifySecurityPolicyAttributesRequest source) {
        if (source.SecurityPolicyId != null) {
            this.SecurityPolicyId = new String(source.SecurityPolicyId);
        }
        if (source.Ciphers != null) {
            this.Ciphers = new String[source.Ciphers.length];
            for (int i = 0; i < source.Ciphers.length; i++) {
                this.Ciphers[i] = new String(source.Ciphers[i]);
            }
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.SecurityPolicyName != null) {
            this.SecurityPolicyName = new String(source.SecurityPolicyName);
        }
        if (source.TLSVersions != null) {
            this.TLSVersions = new String[source.TLSVersions.length];
            for (int i = 0; i < source.TLSVersions.length; i++) {
                this.TLSVersions[i] = new String(source.TLSVersions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityPolicyId", this.SecurityPolicyId);
        this.setParamArraySimple(map, prefix + "Ciphers.", this.Ciphers);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "SecurityPolicyName", this.SecurityPolicyName);
        this.setParamArraySimple(map, prefix + "TLSVersions.", this.TLSVersions);

    }
}

