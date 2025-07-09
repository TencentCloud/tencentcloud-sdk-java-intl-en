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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VertexInfo extends AbstractModel {

    /**
    * Node type: process: 1; network: 2; file: 3; ssh: 4;
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * VID contained in this node
    */
    @SerializedName("Vid")
    @Expose
    private String Vid;

    /**
    * Parent node VID of this node
    */
    @SerializedName("ParentVid")
    @Expose
    private String ParentVid;

    /**
    * Whether a leaf node
    */
    @SerializedName("IsLeaf")
    @Expose
    private Boolean IsLeaf;

    /**
    * Process name, used when Type=1
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcNamePrefix")
    @Expose
    private String ProcNamePrefix;

    /**
    * Process name MD5, used when Type=1
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcNameMd5")
    @Expose
    private String ProcNameMd5;

    /**
    * Command line, used when Type=1
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CmdLinePrefix")
    @Expose
    private String CmdLinePrefix;

    /**
    * Command line MD5, used when Type=1
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CmdLineMd5")
    @Expose
    private String CmdLineMd5;

    /**
    * File path, used when Type=3
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FilePathPrefix")
    @Expose
    private String FilePathPrefix;

    /**
    * Request destination address, used when Type=2
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AddressPrefix")
    @Expose
    private String AddressPrefix;

    /**
    * Whether a vulnerability node
    */
    @SerializedName("IsWeDetect")
    @Expose
    private Boolean IsWeDetect;

    /**
    * Whether an alarm node
    */
    @SerializedName("IsAlarm")
    @Expose
    private Boolean IsAlarm;

    /**
    * File path MD5, used when Type=3
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FilePathMd5")
    @Expose
    private String FilePathMd5;

    /**
    * Request destination address MD5, used when Type=2
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AddressMd5")
    @Expose
    private String AddressMd5;

    /**
     * Get Node type: process: 1; network: 2; file: 3; ssh: 4; 
     * @return Type Node type: process: 1; network: 2; file: 3; ssh: 4;
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Node type: process: 1; network: 2; file: 3; ssh: 4;
     * @param Type Node type: process: 1; network: 2; file: 3; ssh: 4;
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get VID contained in this node 
     * @return Vid VID contained in this node
     */
    public String getVid() {
        return this.Vid;
    }

    /**
     * Set VID contained in this node
     * @param Vid VID contained in this node
     */
    public void setVid(String Vid) {
        this.Vid = Vid;
    }

    /**
     * Get Parent node VID of this node 
     * @return ParentVid Parent node VID of this node
     */
    public String getParentVid() {
        return this.ParentVid;
    }

    /**
     * Set Parent node VID of this node
     * @param ParentVid Parent node VID of this node
     */
    public void setParentVid(String ParentVid) {
        this.ParentVid = ParentVid;
    }

    /**
     * Get Whether a leaf node 
     * @return IsLeaf Whether a leaf node
     */
    public Boolean getIsLeaf() {
        return this.IsLeaf;
    }

    /**
     * Set Whether a leaf node
     * @param IsLeaf Whether a leaf node
     */
    public void setIsLeaf(Boolean IsLeaf) {
        this.IsLeaf = IsLeaf;
    }

    /**
     * Get Process name, used when Type=1
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcNamePrefix Process name, used when Type=1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProcNamePrefix() {
        return this.ProcNamePrefix;
    }

    /**
     * Set Process name, used when Type=1
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcNamePrefix Process name, used when Type=1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcNamePrefix(String ProcNamePrefix) {
        this.ProcNamePrefix = ProcNamePrefix;
    }

    /**
     * Get Process name MD5, used when Type=1
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcNameMd5 Process name MD5, used when Type=1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProcNameMd5() {
        return this.ProcNameMd5;
    }

    /**
     * Set Process name MD5, used when Type=1
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcNameMd5 Process name MD5, used when Type=1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcNameMd5(String ProcNameMd5) {
        this.ProcNameMd5 = ProcNameMd5;
    }

    /**
     * Get Command line, used when Type=1
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CmdLinePrefix Command line, used when Type=1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCmdLinePrefix() {
        return this.CmdLinePrefix;
    }

    /**
     * Set Command line, used when Type=1
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CmdLinePrefix Command line, used when Type=1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCmdLinePrefix(String CmdLinePrefix) {
        this.CmdLinePrefix = CmdLinePrefix;
    }

    /**
     * Get Command line MD5, used when Type=1
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CmdLineMd5 Command line MD5, used when Type=1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCmdLineMd5() {
        return this.CmdLineMd5;
    }

    /**
     * Set Command line MD5, used when Type=1
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CmdLineMd5 Command line MD5, used when Type=1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCmdLineMd5(String CmdLineMd5) {
        this.CmdLineMd5 = CmdLineMd5;
    }

    /**
     * Get File path, used when Type=3
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FilePathPrefix File path, used when Type=3
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFilePathPrefix() {
        return this.FilePathPrefix;
    }

    /**
     * Set File path, used when Type=3
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FilePathPrefix File path, used when Type=3
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFilePathPrefix(String FilePathPrefix) {
        this.FilePathPrefix = FilePathPrefix;
    }

    /**
     * Get Request destination address, used when Type=2
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AddressPrefix Request destination address, used when Type=2
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAddressPrefix() {
        return this.AddressPrefix;
    }

    /**
     * Set Request destination address, used when Type=2
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AddressPrefix Request destination address, used when Type=2
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddressPrefix(String AddressPrefix) {
        this.AddressPrefix = AddressPrefix;
    }

    /**
     * Get Whether a vulnerability node 
     * @return IsWeDetect Whether a vulnerability node
     */
    public Boolean getIsWeDetect() {
        return this.IsWeDetect;
    }

    /**
     * Set Whether a vulnerability node
     * @param IsWeDetect Whether a vulnerability node
     */
    public void setIsWeDetect(Boolean IsWeDetect) {
        this.IsWeDetect = IsWeDetect;
    }

    /**
     * Get Whether an alarm node 
     * @return IsAlarm Whether an alarm node
     */
    public Boolean getIsAlarm() {
        return this.IsAlarm;
    }

    /**
     * Set Whether an alarm node
     * @param IsAlarm Whether an alarm node
     */
    public void setIsAlarm(Boolean IsAlarm) {
        this.IsAlarm = IsAlarm;
    }

    /**
     * Get File path MD5, used when Type=3
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FilePathMd5 File path MD5, used when Type=3
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFilePathMd5() {
        return this.FilePathMd5;
    }

    /**
     * Set File path MD5, used when Type=3
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FilePathMd5 File path MD5, used when Type=3
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFilePathMd5(String FilePathMd5) {
        this.FilePathMd5 = FilePathMd5;
    }

    /**
     * Get Request destination address MD5, used when Type=2
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AddressMd5 Request destination address MD5, used when Type=2
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAddressMd5() {
        return this.AddressMd5;
    }

    /**
     * Set Request destination address MD5, used when Type=2
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AddressMd5 Request destination address MD5, used when Type=2
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddressMd5(String AddressMd5) {
        this.AddressMd5 = AddressMd5;
    }

    public VertexInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VertexInfo(VertexInfo source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Vid != null) {
            this.Vid = new String(source.Vid);
        }
        if (source.ParentVid != null) {
            this.ParentVid = new String(source.ParentVid);
        }
        if (source.IsLeaf != null) {
            this.IsLeaf = new Boolean(source.IsLeaf);
        }
        if (source.ProcNamePrefix != null) {
            this.ProcNamePrefix = new String(source.ProcNamePrefix);
        }
        if (source.ProcNameMd5 != null) {
            this.ProcNameMd5 = new String(source.ProcNameMd5);
        }
        if (source.CmdLinePrefix != null) {
            this.CmdLinePrefix = new String(source.CmdLinePrefix);
        }
        if (source.CmdLineMd5 != null) {
            this.CmdLineMd5 = new String(source.CmdLineMd5);
        }
        if (source.FilePathPrefix != null) {
            this.FilePathPrefix = new String(source.FilePathPrefix);
        }
        if (source.AddressPrefix != null) {
            this.AddressPrefix = new String(source.AddressPrefix);
        }
        if (source.IsWeDetect != null) {
            this.IsWeDetect = new Boolean(source.IsWeDetect);
        }
        if (source.IsAlarm != null) {
            this.IsAlarm = new Boolean(source.IsAlarm);
        }
        if (source.FilePathMd5 != null) {
            this.FilePathMd5 = new String(source.FilePathMd5);
        }
        if (source.AddressMd5 != null) {
            this.AddressMd5 = new String(source.AddressMd5);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Vid", this.Vid);
        this.setParamSimple(map, prefix + "ParentVid", this.ParentVid);
        this.setParamSimple(map, prefix + "IsLeaf", this.IsLeaf);
        this.setParamSimple(map, prefix + "ProcNamePrefix", this.ProcNamePrefix);
        this.setParamSimple(map, prefix + "ProcNameMd5", this.ProcNameMd5);
        this.setParamSimple(map, prefix + "CmdLinePrefix", this.CmdLinePrefix);
        this.setParamSimple(map, prefix + "CmdLineMd5", this.CmdLineMd5);
        this.setParamSimple(map, prefix + "FilePathPrefix", this.FilePathPrefix);
        this.setParamSimple(map, prefix + "AddressPrefix", this.AddressPrefix);
        this.setParamSimple(map, prefix + "IsWeDetect", this.IsWeDetect);
        this.setParamSimple(map, prefix + "IsAlarm", this.IsAlarm);
        this.setParamSimple(map, prefix + "FilePathMd5", this.FilePathMd5);
        this.setParamSimple(map, prefix + "AddressMd5", this.AddressMd5);

    }
}

