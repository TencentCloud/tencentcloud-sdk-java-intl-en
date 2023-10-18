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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TerminateClusterNodesRequest extends AbstractModel {

    /**
    * The instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The list of resources to be terminated.
    */
    @SerializedName("CvmInstanceIds")
    @Expose
    private String [] CvmInstanceIds;

    /**
    * Valid values of node type:
  <li>MASTER</li>
  <li>TASK</li>
  <li>CORE</li>
  <li>ROUTER</li>
    */
    @SerializedName("NodeFlag")
    @Expose
    private String NodeFlag;

    /**
    * The graceful scale-in feature. Valid values:
  <li>`true`: Enabled.</li>
  <li>`false`: Disabled.</li>
    */
    @SerializedName("GraceDownFlag")
    @Expose
    private Boolean GraceDownFlag;

    /**
    * The graceful scale-in wait time in seconds. Value range: 60–1800.
    */
    @SerializedName("GraceDownTime")
    @Expose
    private Long GraceDownTime;

    /**
     * Get The instance ID. 
     * @return InstanceId The instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The instance ID.
     * @param InstanceId The instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The list of resources to be terminated. 
     * @return CvmInstanceIds The list of resources to be terminated.
     */
    public String [] getCvmInstanceIds() {
        return this.CvmInstanceIds;
    }

    /**
     * Set The list of resources to be terminated.
     * @param CvmInstanceIds The list of resources to be terminated.
     */
    public void setCvmInstanceIds(String [] CvmInstanceIds) {
        this.CvmInstanceIds = CvmInstanceIds;
    }

    /**
     * Get Valid values of node type:
  <li>MASTER</li>
  <li>TASK</li>
  <li>CORE</li>
  <li>ROUTER</li> 
     * @return NodeFlag Valid values of node type:
  <li>MASTER</li>
  <li>TASK</li>
  <li>CORE</li>
  <li>ROUTER</li>
     */
    public String getNodeFlag() {
        return this.NodeFlag;
    }

    /**
     * Set Valid values of node type:
  <li>MASTER</li>
  <li>TASK</li>
  <li>CORE</li>
  <li>ROUTER</li>
     * @param NodeFlag Valid values of node type:
  <li>MASTER</li>
  <li>TASK</li>
  <li>CORE</li>
  <li>ROUTER</li>
     */
    public void setNodeFlag(String NodeFlag) {
        this.NodeFlag = NodeFlag;
    }

    /**
     * Get The graceful scale-in feature. Valid values:
  <li>`true`: Enabled.</li>
  <li>`false`: Disabled.</li> 
     * @return GraceDownFlag The graceful scale-in feature. Valid values:
  <li>`true`: Enabled.</li>
  <li>`false`: Disabled.</li>
     */
    public Boolean getGraceDownFlag() {
        return this.GraceDownFlag;
    }

    /**
     * Set The graceful scale-in feature. Valid values:
  <li>`true`: Enabled.</li>
  <li>`false`: Disabled.</li>
     * @param GraceDownFlag The graceful scale-in feature. Valid values:
  <li>`true`: Enabled.</li>
  <li>`false`: Disabled.</li>
     */
    public void setGraceDownFlag(Boolean GraceDownFlag) {
        this.GraceDownFlag = GraceDownFlag;
    }

    /**
     * Get The graceful scale-in wait time in seconds. Value range: 60–1800. 
     * @return GraceDownTime The graceful scale-in wait time in seconds. Value range: 60–1800.
     */
    public Long getGraceDownTime() {
        return this.GraceDownTime;
    }

    /**
     * Set The graceful scale-in wait time in seconds. Value range: 60–1800.
     * @param GraceDownTime The graceful scale-in wait time in seconds. Value range: 60–1800.
     */
    public void setGraceDownTime(Long GraceDownTime) {
        this.GraceDownTime = GraceDownTime;
    }

    public TerminateClusterNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerminateClusterNodesRequest(TerminateClusterNodesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CvmInstanceIds != null) {
            this.CvmInstanceIds = new String[source.CvmInstanceIds.length];
            for (int i = 0; i < source.CvmInstanceIds.length; i++) {
                this.CvmInstanceIds[i] = new String(source.CvmInstanceIds[i]);
            }
        }
        if (source.NodeFlag != null) {
            this.NodeFlag = new String(source.NodeFlag);
        }
        if (source.GraceDownFlag != null) {
            this.GraceDownFlag = new Boolean(source.GraceDownFlag);
        }
        if (source.GraceDownTime != null) {
            this.GraceDownTime = new Long(source.GraceDownTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "CvmInstanceIds.", this.CvmInstanceIds);
        this.setParamSimple(map, prefix + "NodeFlag", this.NodeFlag);
        this.setParamSimple(map, prefix + "GraceDownFlag", this.GraceDownFlag);
        this.setParamSimple(map, prefix + "GraceDownTime", this.GraceDownTime);

    }
}

