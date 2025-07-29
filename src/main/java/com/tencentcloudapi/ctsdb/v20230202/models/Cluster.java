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
package com.tencentcloudapi.ctsdb.v20230202.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Cluster extends AbstractModel {

    /**
    * User APP ID.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * Account ID.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccountID")
    @Expose
    private String AccountID;

    /**
    * Customizes the instance name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Region.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Availability zone.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zones")
    @Expose
    private String Zones;

    /**
    * Network information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Networks")
    @Expose
    private Network [] Networks;

    /**
    * Instance specification.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Spec")
    @Expose
    private Spec Spec;

    /**
    * Instance status. 0: running; 1: creating; 16: adjusting configuration; 17: isolating; 18: to be terminated; 19: recovering; 20: shutting down; 21: terminating; 22: terminated.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Instance validity period.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Period")
    @Expose
    private Period Period;

    /**
    * Creation time.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Last modification time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * Internal features of the product.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tenant")
    @Expose
    private Tenant Tenant;

    /**
    * Tag.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Security group information.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Security")
    @Expose
    private String [] Security;

    /**
     * Get User APP ID.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppID User APP ID.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set User APP ID.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppID User APP ID.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get Instance ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterID Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterID Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get Account ID.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccountID Account ID.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAccountID() {
        return this.AccountID;
    }

    /**
     * Set Account ID.Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccountID Account ID.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccountID(String AccountID) {
        this.AccountID = AccountID;
    }

    /**
     * Get Customizes the instance name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Customizes the instance name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Customizes the instance name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Customizes the instance name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Region.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Region.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Region.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Availability zone.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Zones Availability zone.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZones() {
        return this.Zones;
    }

    /**
     * Set Availability zone.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Zones Availability zone.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZones(String Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Network information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Networks Network information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public Network [] getNetworks() {
        return this.Networks;
    }

    /**
     * Set Network information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Networks Network information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setNetworks(Network [] Networks) {
        this.Networks = Networks;
    }

    /**
     * Get Instance specification.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Spec Instance specification.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public Spec getSpec() {
        return this.Spec;
    }

    /**
     * Set Instance specification.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Spec Instance specification.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setSpec(Spec Spec) {
        this.Spec = Spec;
    }

    /**
     * Get Instance status. 0: running; 1: creating; 16: adjusting configuration; 17: isolating; 18: to be terminated; 19: recovering; 20: shutting down; 21: terminating; 22: terminated.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Instance status. 0: running; 1: creating; 16: adjusting configuration; 17: isolating; 18: to be terminated; 19: recovering; 20: shutting down; 21: terminating; 22: terminated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. 0: running; 1: creating; 16: adjusting configuration; 17: isolating; 18: to be terminated; 19: recovering; 20: shutting down; 21: terminating; 22: terminated.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Instance status. 0: running; 1: creating; 16: adjusting configuration; 17: isolating; 18: to be terminated; 19: recovering; 20: shutting down; 21: terminating; 22: terminated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Instance validity period.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Period Instance validity period.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Period getPeriod() {
        return this.Period;
    }

    /**
     * Set Instance validity period.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Period Instance validity period.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPeriod(Period Period) {
        this.Period = Period;
    }

    /**
     * Get Creation time.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreatedAt Creation time.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Creation time.Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreatedAt Creation time.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Last modification time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdatedAt Last modification time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Last modification time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdatedAt Last modification time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get Internal features of the product.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tenant Internal features of the product.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tenant getTenant() {
        return this.Tenant;
    }

    /**
     * Set Internal features of the product.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tenant Internal features of the product.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTenant(Tenant Tenant) {
        this.Tenant = Tenant;
    }

    /**
     * Get Tag.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Security group information.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Security Security group information.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSecurity() {
        return this.Security;
    }

    /**
     * Set Security group information.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Security Security group information.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSecurity(String [] Security) {
        this.Security = Security;
    }

    public Cluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Cluster(Cluster source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.AccountID != null) {
            this.AccountID = new String(source.AccountID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zones != null) {
            this.Zones = new String(source.Zones);
        }
        if (source.Networks != null) {
            this.Networks = new Network[source.Networks.length];
            for (int i = 0; i < source.Networks.length; i++) {
                this.Networks[i] = new Network(source.Networks[i]);
            }
        }
        if (source.Spec != null) {
            this.Spec = new Spec(source.Spec);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Period != null) {
            this.Period = new Period(source.Period);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.Tenant != null) {
            this.Tenant = new Tenant(source.Tenant);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Security != null) {
            this.Security = new String[source.Security.length];
            for (int i = 0; i < source.Security.length; i++) {
                this.Security[i] = new String(source.Security[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "AccountID", this.AccountID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zones", this.Zones);
        this.setParamArrayObj(map, prefix + "Networks.", this.Networks);
        this.setParamObj(map, prefix + "Spec.", this.Spec);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Period.", this.Period);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamObj(map, prefix + "Tenant.", this.Tenant);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "Security.", this.Security);

    }
}

