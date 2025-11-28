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

public class ClassicalTarget extends AbstractModel {

    /**
    * Real server type. Value range: CVM, ENI (coming soon)
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Unique ID of a real server, which can be obtained from the unInstanceId field in the return of the DescribeInstances API
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Forwarding weight of a real server. Value range: [0, 100]. Default value: 10.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Public network IP of the real server
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * Private network IP of the real server
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
    * Instance name of the real server
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Backend service status.
1: failed; 2: running; 3: creating; 4: shut down; 5: returned; 6: returning; 7: restarting; 8: starting; 9: shutting down; 10: resetting password; 11: formatting; 12: making image; 13: setting bandwidth; 14: reinstalling system; 19: upgrading; 21: hot migrating.
    */
    @SerializedName("RunFlag")
    @Expose
    private Long RunFlag;

    /**
     * Get Real server type. Value range: CVM, ENI (coming soon) 
     * @return Type Real server type. Value range: CVM, ENI (coming soon)
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Real server type. Value range: CVM, ENI (coming soon)
     * @param Type Real server type. Value range: CVM, ENI (coming soon)
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Unique ID of a real server, which can be obtained from the unInstanceId field in the return of the DescribeInstances API 
     * @return InstanceId Unique ID of a real server, which can be obtained from the unInstanceId field in the return of the DescribeInstances API
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Unique ID of a real server, which can be obtained from the unInstanceId field in the return of the DescribeInstances API
     * @param InstanceId Unique ID of a real server, which can be obtained from the unInstanceId field in the return of the DescribeInstances API
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Forwarding weight of a real server. Value range: [0, 100]. Default value: 10. 
     * @return Weight Forwarding weight of a real server. Value range: [0, 100]. Default value: 10.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Forwarding weight of a real server. Value range: [0, 100]. Default value: 10.
     * @param Weight Forwarding weight of a real server. Value range: [0, 100]. Default value: 10.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Public network IP of the real server 
     * @return PublicIpAddresses Public network IP of the real server
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set Public network IP of the real server
     * @param PublicIpAddresses Public network IP of the real server
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get Private network IP of the real server 
     * @return PrivateIpAddresses Private network IP of the real server
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set Private network IP of the real server
     * @param PrivateIpAddresses Private network IP of the real server
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get Instance name of the real server 
     * @return InstanceName Instance name of the real server
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name of the real server
     * @param InstanceName Instance name of the real server
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Backend service status.
1: failed; 2: running; 3: creating; 4: shut down; 5: returned; 6: returning; 7: restarting; 8: starting; 9: shutting down; 10: resetting password; 11: formatting; 12: making image; 13: setting bandwidth; 14: reinstalling system; 19: upgrading; 21: hot migrating. 
     * @return RunFlag Backend service status.
1: failed; 2: running; 3: creating; 4: shut down; 5: returned; 6: returning; 7: restarting; 8: starting; 9: shutting down; 10: resetting password; 11: formatting; 12: making image; 13: setting bandwidth; 14: reinstalling system; 19: upgrading; 21: hot migrating.
     */
    public Long getRunFlag() {
        return this.RunFlag;
    }

    /**
     * Set Backend service status.
1: failed; 2: running; 3: creating; 4: shut down; 5: returned; 6: returning; 7: restarting; 8: starting; 9: shutting down; 10: resetting password; 11: formatting; 12: making image; 13: setting bandwidth; 14: reinstalling system; 19: upgrading; 21: hot migrating.
     * @param RunFlag Backend service status.
1: failed; 2: running; 3: creating; 4: shut down; 5: returned; 6: returning; 7: restarting; 8: starting; 9: shutting down; 10: resetting password; 11: formatting; 12: making image; 13: setting bandwidth; 14: reinstalling system; 19: upgrading; 21: hot migrating.
     */
    public void setRunFlag(Long RunFlag) {
        this.RunFlag = RunFlag;
    }

    public ClassicalTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClassicalTarget(ClassicalTarget source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.PublicIpAddresses != null) {
            this.PublicIpAddresses = new String[source.PublicIpAddresses.length];
            for (int i = 0; i < source.PublicIpAddresses.length; i++) {
                this.PublicIpAddresses[i] = new String(source.PublicIpAddresses[i]);
            }
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new String[source.PrivateIpAddresses.length];
            for (int i = 0; i < source.PrivateIpAddresses.length; i++) {
                this.PrivateIpAddresses[i] = new String(source.PrivateIpAddresses[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.RunFlag != null) {
            this.RunFlag = new Long(source.RunFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "RunFlag", this.RunFlag);

    }
}

