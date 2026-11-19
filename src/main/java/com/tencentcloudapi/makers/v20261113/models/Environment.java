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
package com.tencentcloudapi.makers.v20261113.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Environment extends AbstractModel {

    /**
    * <p>Environment identifier. It cannot be changed after creation.</p>
    */
    @SerializedName("Slug")
    @Expose
    private String Slug;

    /**
    * <p>Environment name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Production,Preview,Custom</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Associate a branch. Wildcards are supported.</p>
    */
    @SerializedName("Branches")
    @Expose
    private String [] Branches;

    /**
    * <p>Whether to deploy automatically. Production is always true</p>
    */
    @SerializedName("AutoDeploy")
    @Expose
    private Boolean AutoDeploy;

    /**
    * <p>Bound custom domain name</p>
    */
    @SerializedName("CustomDomains")
    @Expose
    private String [] CustomDomains;

    /**
    * <p>Environment variable.</p>
    */
    @SerializedName("EnvVars")
    @Expose
    private EnvironmentEnvVar [] EnvVars;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
     * Get <p>Environment identifier. It cannot be changed after creation.</p> 
     * @return Slug <p>Environment identifier. It cannot be changed after creation.</p>
     */
    public String getSlug() {
        return this.Slug;
    }

    /**
     * Set <p>Environment identifier. It cannot be changed after creation.</p>
     * @param Slug <p>Environment identifier. It cannot be changed after creation.</p>
     */
    public void setSlug(String Slug) {
        this.Slug = Slug;
    }

    /**
     * Get <p>Environment name.</p> 
     * @return Name <p>Environment name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Environment name.</p>
     * @param Name <p>Environment name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Production,Preview,Custom</p> 
     * @return Type <p>Production,Preview,Custom</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Production,Preview,Custom</p>
     * @param Type <p>Production,Preview,Custom</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Associate a branch. Wildcards are supported.</p> 
     * @return Branches <p>Associate a branch. Wildcards are supported.</p>
     */
    public String [] getBranches() {
        return this.Branches;
    }

    /**
     * Set <p>Associate a branch. Wildcards are supported.</p>
     * @param Branches <p>Associate a branch. Wildcards are supported.</p>
     */
    public void setBranches(String [] Branches) {
        this.Branches = Branches;
    }

    /**
     * Get <p>Whether to deploy automatically. Production is always true</p> 
     * @return AutoDeploy <p>Whether to deploy automatically. Production is always true</p>
     */
    public Boolean getAutoDeploy() {
        return this.AutoDeploy;
    }

    /**
     * Set <p>Whether to deploy automatically. Production is always true</p>
     * @param AutoDeploy <p>Whether to deploy automatically. Production is always true</p>
     */
    public void setAutoDeploy(Boolean AutoDeploy) {
        this.AutoDeploy = AutoDeploy;
    }

    /**
     * Get <p>Bound custom domain name</p> 
     * @return CustomDomains <p>Bound custom domain name</p>
     */
    public String [] getCustomDomains() {
        return this.CustomDomains;
    }

    /**
     * Set <p>Bound custom domain name</p>
     * @param CustomDomains <p>Bound custom domain name</p>
     */
    public void setCustomDomains(String [] CustomDomains) {
        this.CustomDomains = CustomDomains;
    }

    /**
     * Get <p>Environment variable.</p> 
     * @return EnvVars <p>Environment variable.</p>
     */
    public EnvironmentEnvVar [] getEnvVars() {
        return this.EnvVars;
    }

    /**
     * Set <p>Environment variable.</p>
     * @param EnvVars <p>Environment variable.</p>
     */
    public void setEnvVars(EnvironmentEnvVar [] EnvVars) {
        this.EnvVars = EnvVars;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreatedOn <p>Creation time.</p>
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreatedOn <p>Creation time.</p>
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get <p>Update time.</p> 
     * @return ModifiedOn <p>Update time.</p>
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set <p>Update time.</p>
     * @param ModifiedOn <p>Update time.</p>
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    public Environment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Environment(Environment source) {
        if (source.Slug != null) {
            this.Slug = new String(source.Slug);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Branches != null) {
            this.Branches = new String[source.Branches.length];
            for (int i = 0; i < source.Branches.length; i++) {
                this.Branches[i] = new String(source.Branches[i]);
            }
        }
        if (source.AutoDeploy != null) {
            this.AutoDeploy = new Boolean(source.AutoDeploy);
        }
        if (source.CustomDomains != null) {
            this.CustomDomains = new String[source.CustomDomains.length];
            for (int i = 0; i < source.CustomDomains.length; i++) {
                this.CustomDomains[i] = new String(source.CustomDomains[i]);
            }
        }
        if (source.EnvVars != null) {
            this.EnvVars = new EnvironmentEnvVar[source.EnvVars.length];
            for (int i = 0; i < source.EnvVars.length; i++) {
                this.EnvVars[i] = new EnvironmentEnvVar(source.EnvVars[i]);
            }
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Slug", this.Slug);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Branches.", this.Branches);
        this.setParamSimple(map, prefix + "AutoDeploy", this.AutoDeploy);
        this.setParamArraySimple(map, prefix + "CustomDomains.", this.CustomDomains);
        this.setParamArrayObj(map, prefix + "EnvVars.", this.EnvVars);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);

    }
}

