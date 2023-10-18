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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountVpcInfo extends AbstractModel {

    /**
    * VpcId: vpc-xadsafsdasd
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * VPC region: ap-guangzhou, ap-shanghai
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * VPC account: 123456789
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * VPC name: testname
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
     * Get VpcId: vpc-xadsafsdasd 
     * @return UniqVpcId VpcId: vpc-xadsafsdasd
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VpcId: vpc-xadsafsdasd
     * @param UniqVpcId VpcId: vpc-xadsafsdasd
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get VPC region: ap-guangzhou, ap-shanghai
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Region VPC region: ap-guangzhou, ap-shanghai
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set VPC region: ap-guangzhou, ap-shanghai
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Region VPC region: ap-guangzhou, ap-shanghai
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get VPC account: 123456789
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Uin VPC account: 123456789
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set VPC account: 123456789
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Uin VPC account: 123456789
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get VPC name: testname
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return VpcName VPC name: testname
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC name: testname
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param VpcName VPC name: testname
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    public AccountVpcInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountVpcInfo(AccountVpcInfo source) {
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);

    }
}

