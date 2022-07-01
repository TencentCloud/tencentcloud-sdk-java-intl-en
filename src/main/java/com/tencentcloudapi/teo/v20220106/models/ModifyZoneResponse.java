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

public class ModifyZoneResponse extends AbstractModel{

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
    * Name server used by the site
    */
    @SerializedName("OriginalNameServers")
    @Expose
    private String [] OriginalNameServers;

    /**
    * Site status.
- `pending`: The name server is not connected.
- `active`: The name server is connected.
- `moved`: The name server is moved.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Specifies how the site is connected to EdgeOne.
- `full`: Connect via the name server.
- `partial`: Connect via the CNAME.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * List of name servers assigned by Tencent Cloud
    */
    @SerializedName("NameServers")
    @Expose
    private String [] NameServers;

    /**
    * Creation time
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * Modification time
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
    * CNAME access status.
- `finished`: Ownership of the site is verified.
- `pending`: Verifying the ownership of the site.
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
     * Get Name server used by the site 
     * @return OriginalNameServers Name server used by the site
     */
    public String [] getOriginalNameServers() {
        return this.OriginalNameServers;
    }

    /**
     * Set Name server used by the site
     * @param OriginalNameServers Name server used by the site
     */
    public void setOriginalNameServers(String [] OriginalNameServers) {
        this.OriginalNameServers = OriginalNameServers;
    }

    /**
     * Get Site status.
- `pending`: The name server is not connected.
- `active`: The name server is connected.
- `moved`: The name server is moved. 
     * @return Status Site status.
- `pending`: The name server is not connected.
- `active`: The name server is connected.
- `moved`: The name server is moved.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Site status.
- `pending`: The name server is not connected.
- `active`: The name server is connected.
- `moved`: The name server is moved.
     * @param Status Site status.
- `pending`: The name server is not connected.
- `active`: The name server is connected.
- `moved`: The name server is moved.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Specifies how the site is connected to EdgeOne.
- `full`: Connect via the name server.
- `partial`: Connect via the CNAME. 
     * @return Type Specifies how the site is connected to EdgeOne.
- `full`: Connect via the name server.
- `partial`: Connect via the CNAME.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Specifies how the site is connected to EdgeOne.
- `full`: Connect via the name server.
- `partial`: Connect via the CNAME.
     * @param Type Specifies how the site is connected to EdgeOne.
- `full`: Connect via the name server.
- `partial`: Connect via the CNAME.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get List of name servers assigned by Tencent Cloud 
     * @return NameServers List of name servers assigned by Tencent Cloud
     */
    public String [] getNameServers() {
        return this.NameServers;
    }

    /**
     * Set List of name servers assigned by Tencent Cloud
     * @param NameServers List of name servers assigned by Tencent Cloud
     */
    public void setNameServers(String [] NameServers) {
        this.NameServers = NameServers;
    }

    /**
     * Get Creation time 
     * @return CreatedOn Creation time
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set Creation time
     * @param CreatedOn Creation time
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get Modification time 
     * @return ModifiedOn Modification time
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set Modification time
     * @param ModifiedOn Modification time
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    /**
     * Get CNAME access status.
- `finished`: Ownership of the site is verified.
- `pending`: Verifying the ownership of the site.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CnameStatus CNAME access status.
- `finished`: Ownership of the site is verified.
- `pending`: Verifying the ownership of the site.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getCnameStatus() {
        return this.CnameStatus;
    }

    /**
     * Set CNAME access status.
- `finished`: Ownership of the site is verified.
- `pending`: Verifying the ownership of the site.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CnameStatus CNAME access status.
- `finished`: Ownership of the site is verified.
- `pending`: Verifying the ownership of the site.
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

    public ModifyZoneResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyZoneResponse(ModifyZoneResponse source) {
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
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.NameServers != null) {
            this.NameServers = new String[source.NameServers.length];
            for (int i = 0; i < source.NameServers.length; i++) {
                this.NameServers[i] = new String(source.NameServers[i]);
            }
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "NameServers.", this.NameServers);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);
        this.setParamSimple(map, prefix + "CnameStatus", this.CnameStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

