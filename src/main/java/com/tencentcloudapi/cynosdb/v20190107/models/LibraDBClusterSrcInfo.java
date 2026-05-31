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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LibraDBClusterSrcInfo extends AbstractModel {

    /**
    * Source endpoint type
    */
    @SerializedName("SrcInstanceType")
    @Expose
    private String SrcInstanceType;

    /**
    * Network type.
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * Source instance ID
    */
    @SerializedName("SrcInstanceId")
    @Expose
    private String SrcInstanceId;

    /**
    * Source cluster ID
    */
    @SerializedName("SrcClusterId")
    @Expose
    private String SrcClusterId;

    /**
    * Address.
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * Port.
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Username.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Password.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Source sql mode
    */
    @SerializedName("SqlMode")
    @Expose
    private String SqlMode;

    /**
    * Source application id
    */
    @SerializedName("SrcAppId")
    @Expose
    private Long SrcAppId;

    /**
    * source account
    */
    @SerializedName("SrcUin")
    @Expose
    private String SrcUin;

    /**
    * sub-account
    */
    @SerializedName("SrcSubAccountUin")
    @Expose
    private String SrcSubAccountUin;

    /**
    * Account
    */
    @SerializedName("AccountMode")
    @Expose
    private String AccountMode;

    /**
    * Source instance region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Operation of the source instance
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
     * Get Source endpoint type 
     * @return SrcInstanceType Source endpoint type
     */
    public String getSrcInstanceType() {
        return this.SrcInstanceType;
    }

    /**
     * Set Source endpoint type
     * @param SrcInstanceType Source endpoint type
     */
    public void setSrcInstanceType(String SrcInstanceType) {
        this.SrcInstanceType = SrcInstanceType;
    }

    /**
     * Get Network type. 
     * @return AccessType Network type.
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set Network type.
     * @param AccessType Network type.
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get Source instance ID 
     * @return SrcInstanceId Source instance ID
     */
    public String getSrcInstanceId() {
        return this.SrcInstanceId;
    }

    /**
     * Set Source instance ID
     * @param SrcInstanceId Source instance ID
     */
    public void setSrcInstanceId(String SrcInstanceId) {
        this.SrcInstanceId = SrcInstanceId;
    }

    /**
     * Get Source cluster ID 
     * @return SrcClusterId Source cluster ID
     */
    public String getSrcClusterId() {
        return this.SrcClusterId;
    }

    /**
     * Set Source cluster ID
     * @param SrcClusterId Source cluster ID
     */
    public void setSrcClusterId(String SrcClusterId) {
        this.SrcClusterId = SrcClusterId;
    }

    /**
     * Get Address. 
     * @return IP Address.
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set Address.
     * @param IP Address.
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get Port. 
     * @return Port Port.
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Port.
     * @param Port Port.
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get Username. 
     * @return User Username.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Username.
     * @param User Username.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Password. 
     * @return Password Password.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Password.
     * @param Password Password.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Source sql mode 
     * @return SqlMode Source sql mode
     */
    public String getSqlMode() {
        return this.SqlMode;
    }

    /**
     * Set Source sql mode
     * @param SqlMode Source sql mode
     */
    public void setSqlMode(String SqlMode) {
        this.SqlMode = SqlMode;
    }

    /**
     * Get Source application id 
     * @return SrcAppId Source application id
     */
    public Long getSrcAppId() {
        return this.SrcAppId;
    }

    /**
     * Set Source application id
     * @param SrcAppId Source application id
     */
    public void setSrcAppId(Long SrcAppId) {
        this.SrcAppId = SrcAppId;
    }

    /**
     * Get source account 
     * @return SrcUin source account
     */
    public String getSrcUin() {
        return this.SrcUin;
    }

    /**
     * Set source account
     * @param SrcUin source account
     */
    public void setSrcUin(String SrcUin) {
        this.SrcUin = SrcUin;
    }

    /**
     * Get sub-account 
     * @return SrcSubAccountUin sub-account
     */
    public String getSrcSubAccountUin() {
        return this.SrcSubAccountUin;
    }

    /**
     * Set sub-account
     * @param SrcSubAccountUin sub-account
     */
    public void setSrcSubAccountUin(String SrcSubAccountUin) {
        this.SrcSubAccountUin = SrcSubAccountUin;
    }

    /**
     * Get Account 
     * @return AccountMode Account
     */
    public String getAccountMode() {
        return this.AccountMode;
    }

    /**
     * Set Account
     * @param AccountMode Account
     */
    public void setAccountMode(String AccountMode) {
        this.AccountMode = AccountMode;
    }

    /**
     * Get Source instance region 
     * @return Region Source instance region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Source instance region
     * @param Region Source instance region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Operation of the source instance 
     * @return Operation Operation of the source instance
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Operation of the source instance
     * @param Operation Operation of the source instance
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    public LibraDBClusterSrcInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LibraDBClusterSrcInfo(LibraDBClusterSrcInfo source) {
        if (source.SrcInstanceType != null) {
            this.SrcInstanceType = new String(source.SrcInstanceType);
        }
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.SrcInstanceId != null) {
            this.SrcInstanceId = new String(source.SrcInstanceId);
        }
        if (source.SrcClusterId != null) {
            this.SrcClusterId = new String(source.SrcClusterId);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.SqlMode != null) {
            this.SqlMode = new String(source.SqlMode);
        }
        if (source.SrcAppId != null) {
            this.SrcAppId = new Long(source.SrcAppId);
        }
        if (source.SrcUin != null) {
            this.SrcUin = new String(source.SrcUin);
        }
        if (source.SrcSubAccountUin != null) {
            this.SrcSubAccountUin = new String(source.SrcSubAccountUin);
        }
        if (source.AccountMode != null) {
            this.AccountMode = new String(source.AccountMode);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcInstanceType", this.SrcInstanceType);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "SrcInstanceId", this.SrcInstanceId);
        this.setParamSimple(map, prefix + "SrcClusterId", this.SrcClusterId);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "SqlMode", this.SqlMode);
        this.setParamSimple(map, prefix + "SrcAppId", this.SrcAppId);
        this.setParamSimple(map, prefix + "SrcUin", this.SrcUin);
        this.setParamSimple(map, prefix + "SrcSubAccountUin", this.SrcSubAccountUin);
        this.setParamSimple(map, prefix + "AccountMode", this.AccountMode);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Operation", this.Operation);

    }
}

