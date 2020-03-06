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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PGroupInfo extends AbstractModel{

    /**
    * Permission group ID
    */
    @SerializedName("PGroupId")
    @Expose
    private String PGroupId;

    /**
    * Permission group name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description
    */
    @SerializedName("DescInfo")
    @Expose
    private String DescInfo;

    /**
    * Creation time
    */
    @SerializedName("CDate")
    @Expose
    private String CDate;

    /**
    * The number of bound file system
    */
    @SerializedName("BindCfsNum")
    @Expose
    private Long BindCfsNum;

    /**
     * Get Permission group ID 
     * @return PGroupId Permission group ID
     */
    public String getPGroupId() {
        return this.PGroupId;
    }

    /**
     * Set Permission group ID
     * @param PGroupId Permission group ID
     */
    public void setPGroupId(String PGroupId) {
        this.PGroupId = PGroupId;
    }

    /**
     * Get Permission group name 
     * @return Name Permission group name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Permission group name
     * @param Name Permission group name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description 
     * @return DescInfo Description
     */
    public String getDescInfo() {
        return this.DescInfo;
    }

    /**
     * Set Description
     * @param DescInfo Description
     */
    public void setDescInfo(String DescInfo) {
        this.DescInfo = DescInfo;
    }

    /**
     * Get Creation time 
     * @return CDate Creation time
     */
    public String getCDate() {
        return this.CDate;
    }

    /**
     * Set Creation time
     * @param CDate Creation time
     */
    public void setCDate(String CDate) {
        this.CDate = CDate;
    }

    /**
     * Get The number of bound file system 
     * @return BindCfsNum The number of bound file system
     */
    public Long getBindCfsNum() {
        return this.BindCfsNum;
    }

    /**
     * Set The number of bound file system
     * @param BindCfsNum The number of bound file system
     */
    public void setBindCfsNum(Long BindCfsNum) {
        this.BindCfsNum = BindCfsNum;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PGroupId", this.PGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DescInfo", this.DescInfo);
        this.setParamSimple(map, prefix + "CDate", this.CDate);
        this.setParamSimple(map, prefix + "BindCfsNum", this.BindCfsNum);

    }
}

