/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeZoneDetailsResponse extends AbstractModel{

    /**
    * Site ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Site name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * List of name servers used
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("OriginalNameServers")
    @Expose
    private String [] OriginalNameServers;

    /**
    * List of name servers assigned to users by Tencent Cloud
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("NameServers")
    @Expose
    private String [] NameServers;

    /**
    * Site status
- `active`: The name server is switched.
- `pending`: The name server is not switched.
- `moved`: The name server is moved.
- `deactivated`: The name server is blocked.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Specifies how the site is connected to EdgeOne.
- `full`: The site is connected via name server.
- `partial`: The site is connected via CNAME.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Indicates whether the site is disabled
    */
    @SerializedName("Paused")
    @Expose
    private Boolean Paused;

    /**
    * Site creation date
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * Site modification date
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
    * User-defined name server information
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("VanityNameServers")
    @Expose
    private VanityNameServers VanityNameServers;

    /**
    * User-defined name server IP information
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("VanityNameServersIps")
    @Expose
    private VanityNameServersIps [] VanityNameServersIps;

    /**
    * Specifies whether to enable CNAME acceleration
- `enabled`: Enable
- `disabled`: Disable
    */
    @SerializedName("CnameSpeedUp")
    @Expose
    private String CnameSpeedUp;

    /**
    * Ownership verification status of the site when it accesses via CNAME.
- `finished`: The site is verified.
- `pending`: The site is waiting for verification.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("CnameStatus")
    @Expose
    private String CnameStatus;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Site ID 
     * @return Id Site ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Site ID
     * @param Id Site ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Site name 
     * @return Name Site name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Site name
     * @param Name Site name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get List of name servers used
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return OriginalNameServers List of name servers used
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getOriginalNameServers() {
        return this.OriginalNameServers;
    }

    /**
     * Set List of name servers used
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param OriginalNameServers List of name servers used
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setOriginalNameServers(String [] OriginalNameServers) {
        this.OriginalNameServers = OriginalNameServers;
    }

    /**
     * Get List of name servers assigned to users by Tencent Cloud
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return NameServers List of name servers assigned to users by Tencent Cloud
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getNameServers() {
        return this.NameServers;
    }

    /**
     * Set List of name servers assigned to users by Tencent Cloud
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param NameServers List of name servers assigned to users by Tencent Cloud
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setNameServers(String [] NameServers) {
        this.NameServers = NameServers;
    }

    /**
     * Get Site status
- `active`: The name server is switched.
- `pending`: The name server is not switched.
- `moved`: The name server is moved.
- `deactivated`: The name server is blocked. 
     * @return Status Site status
- `active`: The name server is switched.
- `pending`: The name server is not switched.
- `moved`: The name server is moved.
- `deactivated`: The name server is blocked.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Site status
- `active`: The name server is switched.
- `pending`: The name server is not switched.
- `moved`: The name server is moved.
- `deactivated`: The name server is blocked.
     * @param Status Site status
- `active`: The name server is switched.
- `pending`: The name server is not switched.
- `moved`: The name server is moved.
- `deactivated`: The name server is blocked.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Specifies how the site is connected to EdgeOne.
- `full`: The site is connected via name server.
- `partial`: The site is connected via CNAME. 
     * @return Type Specifies how the site is connected to EdgeOne.
- `full`: The site is connected via name server.
- `partial`: The site is connected via CNAME.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Specifies how the site is connected to EdgeOne.
- `full`: The site is connected via name server.
- `partial`: The site is connected via CNAME.
     * @param Type Specifies how the site is connected to EdgeOne.
- `full`: The site is connected via name server.
- `partial`: The site is connected via CNAME.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Indicates whether the site is disabled 
     * @return Paused Indicates whether the site is disabled
     */
    public Boolean getPaused() {
        return this.Paused;
    }

    /**
     * Set Indicates whether the site is disabled
     * @param Paused Indicates whether the site is disabled
     */
    public void setPaused(Boolean Paused) {
        this.Paused = Paused;
    }

    /**
     * Get Site creation date 
     * @return CreatedOn Site creation date
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set Site creation date
     * @param CreatedOn Site creation date
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get Site modification date 
     * @return ModifiedOn Site modification date
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set Site modification date
     * @param ModifiedOn Site modification date
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    /**
     * Get User-defined name server information
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return VanityNameServers User-defined name server information
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public VanityNameServers getVanityNameServers() {
        return this.VanityNameServers;
    }

    /**
     * Set User-defined name server information
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param VanityNameServers User-defined name server information
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setVanityNameServers(VanityNameServers VanityNameServers) {
        this.VanityNameServers = VanityNameServers;
    }

    /**
     * Get User-defined name server IP information
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return VanityNameServersIps User-defined name server IP information
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public VanityNameServersIps [] getVanityNameServersIps() {
        return this.VanityNameServersIps;
    }

    /**
     * Set User-defined name server IP information
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param VanityNameServersIps User-defined name server IP information
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setVanityNameServersIps(VanityNameServersIps [] VanityNameServersIps) {
        this.VanityNameServersIps = VanityNameServersIps;
    }

    /**
     * Get Specifies whether to enable CNAME acceleration
- `enabled`: Enable
- `disabled`: Disable 
     * @return CnameSpeedUp Specifies whether to enable CNAME acceleration
- `enabled`: Enable
- `disabled`: Disable
     */
    public String getCnameSpeedUp() {
        return this.CnameSpeedUp;
    }

    /**
     * Set Specifies whether to enable CNAME acceleration
- `enabled`: Enable
- `disabled`: Disable
     * @param CnameSpeedUp Specifies whether to enable CNAME acceleration
- `enabled`: Enable
- `disabled`: Disable
     */
    public void setCnameSpeedUp(String CnameSpeedUp) {
        this.CnameSpeedUp = CnameSpeedUp;
    }

    /**
     * Get Ownership verification status of the site when it accesses via CNAME.
- `finished`: The site is verified.
- `pending`: The site is waiting for verification.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CnameStatus Ownership verification status of the site when it accesses via CNAME.
- `finished`: The site is verified.
- `pending`: The site is waiting for verification.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getCnameStatus() {
        return this.CnameStatus;
    }

    /**
     * Set Ownership verification status of the site when it accesses via CNAME.
- `finished`: The site is verified.
- `pending`: The site is waiting for verification.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CnameStatus Ownership verification status of the site when it accesses via CNAME.
- `finished`: The site is verified.
- `pending`: The site is waiting for verification.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCnameStatus(String CnameStatus) {
        this.CnameStatus = CnameStatus;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeZoneDetailsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeZoneDetailsResponse(DescribeZoneDetailsResponse source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.OriginalNameServers != null) {
            this.OriginalNameServers = new String[source.OriginalNameServers.length];
            for (int i = 0; i < source.OriginalNameServers.length; i++) {
                this.OriginalNameServers[i] = new String(source.OriginalNameServers[i]);
            }
        }
        if (source.NameServers != null) {
            this.NameServers = new String[source.NameServers.length];
            for (int i = 0; i < source.NameServers.length; i++) {
                this.NameServers[i] = new String(source.NameServers[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Paused != null) {
            this.Paused = new Boolean(source.Paused);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
        if (source.VanityNameServers != null) {
            this.VanityNameServers = new VanityNameServers(source.VanityNameServers);
        }
        if (source.VanityNameServersIps != null) {
            this.VanityNameServersIps = new VanityNameServersIps[source.VanityNameServersIps.length];
            for (int i = 0; i < source.VanityNameServersIps.length; i++) {
                this.VanityNameServersIps[i] = new VanityNameServersIps(source.VanityNameServersIps[i]);
            }
        }
        if (source.CnameSpeedUp != null) {
            this.CnameSpeedUp = new String(source.CnameSpeedUp);
        }
        if (source.CnameStatus != null) {
            this.CnameStatus = new String(source.CnameStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "OriginalNameServers.", this.OriginalNameServers);
        this.setParamArraySimple(map, prefix + "NameServers.", this.NameServers);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Paused", this.Paused);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);
        this.setParamObj(map, prefix + "VanityNameServers.", this.VanityNameServers);
        this.setParamArrayObj(map, prefix + "VanityNameServersIps.", this.VanityNameServersIps);
        this.setParamSimple(map, prefix + "CnameSpeedUp", this.CnameSpeedUp);
        this.setParamSimple(map, prefix + "CnameStatus", this.CnameStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

