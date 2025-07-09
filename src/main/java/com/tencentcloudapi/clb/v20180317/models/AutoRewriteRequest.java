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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoRewriteRequest extends AbstractModel {

    /**
    * CLB instance ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * `HTTPS:443` listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * The domain name to be redirected under the listener `HTTPS:443`. If it is left empty, all domain names under the listener `HTTPS:443` will be configured with redirects.
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * Redirection status code. Valid values: 301, 302, and 307.
    */
    @SerializedName("RewriteCodes")
    @Expose
    private Long [] RewriteCodes;

    /**
    * Whether the matched URL is carried in redirection.
    */
    @SerializedName("TakeUrls")
    @Expose
    private Boolean [] TakeUrls;

    /**
     * Get CLB instance ID 
     * @return LoadBalancerId CLB instance ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID
     * @param LoadBalancerId CLB instance ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get `HTTPS:443` listener ID 
     * @return ListenerId `HTTPS:443` listener ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set `HTTPS:443` listener ID
     * @param ListenerId `HTTPS:443` listener ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get The domain name to be redirected under the listener `HTTPS:443`. If it is left empty, all domain names under the listener `HTTPS:443` will be configured with redirects. 
     * @return Domains The domain name to be redirected under the listener `HTTPS:443`. If it is left empty, all domain names under the listener `HTTPS:443` will be configured with redirects.
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set The domain name to be redirected under the listener `HTTPS:443`. If it is left empty, all domain names under the listener `HTTPS:443` will be configured with redirects.
     * @param Domains The domain name to be redirected under the listener `HTTPS:443`. If it is left empty, all domain names under the listener `HTTPS:443` will be configured with redirects.
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get Redirection status code. Valid values: 301, 302, and 307. 
     * @return RewriteCodes Redirection status code. Valid values: 301, 302, and 307.
     */
    public Long [] getRewriteCodes() {
        return this.RewriteCodes;
    }

    /**
     * Set Redirection status code. Valid values: 301, 302, and 307.
     * @param RewriteCodes Redirection status code. Valid values: 301, 302, and 307.
     */
    public void setRewriteCodes(Long [] RewriteCodes) {
        this.RewriteCodes = RewriteCodes;
    }

    /**
     * Get Whether the matched URL is carried in redirection. 
     * @return TakeUrls Whether the matched URL is carried in redirection.
     */
    public Boolean [] getTakeUrls() {
        return this.TakeUrls;
    }

    /**
     * Set Whether the matched URL is carried in redirection.
     * @param TakeUrls Whether the matched URL is carried in redirection.
     */
    public void setTakeUrls(Boolean [] TakeUrls) {
        this.TakeUrls = TakeUrls;
    }

    public AutoRewriteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoRewriteRequest(AutoRewriteRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.RewriteCodes != null) {
            this.RewriteCodes = new Long[source.RewriteCodes.length];
            for (int i = 0; i < source.RewriteCodes.length; i++) {
                this.RewriteCodes[i] = new Long(source.RewriteCodes[i]);
            }
        }
        if (source.TakeUrls != null) {
            this.TakeUrls = new Boolean[source.TakeUrls.length];
            for (int i = 0; i < source.TakeUrls.length; i++) {
                this.TakeUrls[i] = new Boolean(source.TakeUrls[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArraySimple(map, prefix + "RewriteCodes.", this.RewriteCodes);
        this.setParamArraySimple(map, prefix + "TakeUrls.", this.TakeUrls);

    }
}

