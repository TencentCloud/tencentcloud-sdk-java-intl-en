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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GitRepoConfig extends AbstractModel {

    /**
    * <p>Checkout rules</p>
    */
    @SerializedName("SparseCheckout")
    @Expose
    private SparseCheckoutConfig SparseCheckout;

    /**
    * <p>Git repository URL</p>
    */
    @SerializedName("RepoUrl")
    @Expose
    private String RepoUrl;

    /**
    * <p>Branch name.</p>
    */
    @SerializedName("Branch")
    @Expose
    private String Branch;

    /**
    * <p>Associated gitAuth configuration name</p>
    */
    @SerializedName("AuthConfigName")
    @Expose
    private String AuthConfigName;

    /**
     * Get <p>Checkout rules</p> 
     * @return SparseCheckout <p>Checkout rules</p>
     */
    public SparseCheckoutConfig getSparseCheckout() {
        return this.SparseCheckout;
    }

    /**
     * Set <p>Checkout rules</p>
     * @param SparseCheckout <p>Checkout rules</p>
     */
    public void setSparseCheckout(SparseCheckoutConfig SparseCheckout) {
        this.SparseCheckout = SparseCheckout;
    }

    /**
     * Get <p>Git repository URL</p> 
     * @return RepoUrl <p>Git repository URL</p>
     */
    public String getRepoUrl() {
        return this.RepoUrl;
    }

    /**
     * Set <p>Git repository URL</p>
     * @param RepoUrl <p>Git repository URL</p>
     */
    public void setRepoUrl(String RepoUrl) {
        this.RepoUrl = RepoUrl;
    }

    /**
     * Get <p>Branch name.</p> 
     * @return Branch <p>Branch name.</p>
     */
    public String getBranch() {
        return this.Branch;
    }

    /**
     * Set <p>Branch name.</p>
     * @param Branch <p>Branch name.</p>
     */
    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    /**
     * Get <p>Associated gitAuth configuration name</p> 
     * @return AuthConfigName <p>Associated gitAuth configuration name</p>
     */
    public String getAuthConfigName() {
        return this.AuthConfigName;
    }

    /**
     * Set <p>Associated gitAuth configuration name</p>
     * @param AuthConfigName <p>Associated gitAuth configuration name</p>
     */
    public void setAuthConfigName(String AuthConfigName) {
        this.AuthConfigName = AuthConfigName;
    }

    public GitRepoConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GitRepoConfig(GitRepoConfig source) {
        if (source.SparseCheckout != null) {
            this.SparseCheckout = new SparseCheckoutConfig(source.SparseCheckout);
        }
        if (source.RepoUrl != null) {
            this.RepoUrl = new String(source.RepoUrl);
        }
        if (source.Branch != null) {
            this.Branch = new String(source.Branch);
        }
        if (source.AuthConfigName != null) {
            this.AuthConfigName = new String(source.AuthConfigName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SparseCheckout.", this.SparseCheckout);
        this.setParamSimple(map, prefix + "RepoUrl", this.RepoUrl);
        this.setParamSimple(map, prefix + "Branch", this.Branch);
        this.setParamSimple(map, prefix + "AuthConfigName", this.AuthConfigName);

    }
}

