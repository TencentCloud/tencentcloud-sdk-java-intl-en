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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageAssociatedContainer extends AbstractModel {

    /**
    * <p>Container id</p>
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * <p>Container name.</p>
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * <p>pod name.</p>
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * <p>pod ip</p>
    */
    @SerializedName("PodIp")
    @Expose
    private String PodIp;

    /**
    * <p>Account name to which the pod belongs</p>
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * <p>appid of the account associated with the pod</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>uin of the account to which the pod belongs</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Cluster name.</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>Cluster status.</p><p>Enumeration values: </p><ul><li>Running: Running, </li><li>Exception: Exception, </li><li>Unknown: Unknown, </li><li>Creating: Creating.</li></ul>
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

    /**
    * <p>Image cmd</p>
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

    /**
    * <p>Pod unique id</p>
    */
    @SerializedName("PodId")
    @Expose
    private String PodId;

    /**
    * <p>Unique cluster Id.</p>
    */
    @SerializedName("ClusterCaMd5")
    @Expose
    private String ClusterCaMd5;

    /**
     * Get <p>Container id</p> 
     * @return ContainerId <p>Container id</p>
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set <p>Container id</p>
     * @param ContainerId <p>Container id</p>
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get <p>Container name.</p> 
     * @return ContainerName <p>Container name.</p>
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set <p>Container name.</p>
     * @param ContainerName <p>Container name.</p>
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get <p>pod name.</p> 
     * @return PodName <p>pod name.</p>
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set <p>pod name.</p>
     * @param PodName <p>pod name.</p>
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get <p>pod ip</p> 
     * @return PodIp <p>pod ip</p>
     */
    public String getPodIp() {
        return this.PodIp;
    }

    /**
     * Set <p>pod ip</p>
     * @param PodIp <p>pod ip</p>
     */
    public void setPodIp(String PodIp) {
        this.PodIp = PodIp;
    }

    /**
     * Get <p>Account name to which the pod belongs</p> 
     * @return OwnerAccountName <p>Account name to which the pod belongs</p>
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set <p>Account name to which the pod belongs</p>
     * @param OwnerAccountName <p>Account name to which the pod belongs</p>
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get <p>appid of the account associated with the pod</p> 
     * @return OwnerAppId <p>appid of the account associated with the pod</p>
     */
    public Long getOwnerAppId() {
        return this.OwnerAppId;
    }

    /**
     * Set <p>appid of the account associated with the pod</p>
     * @param OwnerAppId <p>appid of the account associated with the pod</p>
     */
    public void setOwnerAppId(Long OwnerAppId) {
        this.OwnerAppId = OwnerAppId;
    }

    /**
     * Get <p>uin of the account to which the pod belongs</p> 
     * @return OwnerUin <p>uin of the account to which the pod belongs</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>uin of the account to which the pod belongs</p>
     * @param OwnerUin <p>uin of the account to which the pod belongs</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterId <p>Cluster ID.</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterId <p>Cluster ID.</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Cluster name.</p> 
     * @return ClusterName <p>Cluster name.</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>Cluster name.</p>
     * @param ClusterName <p>Cluster name.</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>Cluster status.</p><p>Enumeration values: </p><ul><li>Running: Running, </li><li>Exception: Exception, </li><li>Unknown: Unknown, </li><li>Creating: Creating.</li></ul> 
     * @return ClusterStatus <p>Cluster status.</p><p>Enumeration values: </p><ul><li>Running: Running, </li><li>Exception: Exception, </li><li>Unknown: Unknown, </li><li>Creating: Creating.</li></ul>
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set <p>Cluster status.</p><p>Enumeration values: </p><ul><li>Running: Running, </li><li>Exception: Exception, </li><li>Unknown: Unknown, </li><li>Creating: Creating.</li></ul>
     * @param ClusterStatus <p>Cluster status.</p><p>Enumeration values: </p><ul><li>Running: Running, </li><li>Exception: Exception, </li><li>Unknown: Unknown, </li><li>Creating: Creating.</li></ul>
     */
    public void setClusterStatus(String ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get <p>Image cmd</p> 
     * @return Cmd <p>Image cmd</p>
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * Set <p>Image cmd</p>
     * @param Cmd <p>Image cmd</p>
     */
    public void setCmd(String Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * Get <p>Pod unique id</p> 
     * @return PodId <p>Pod unique id</p>
     */
    public String getPodId() {
        return this.PodId;
    }

    /**
     * Set <p>Pod unique id</p>
     * @param PodId <p>Pod unique id</p>
     */
    public void setPodId(String PodId) {
        this.PodId = PodId;
    }

    /**
     * Get <p>Unique cluster Id.</p> 
     * @return ClusterCaMd5 <p>Unique cluster Id.</p>
     */
    public String getClusterCaMd5() {
        return this.ClusterCaMd5;
    }

    /**
     * Set <p>Unique cluster Id.</p>
     * @param ClusterCaMd5 <p>Unique cluster Id.</p>
     */
    public void setClusterCaMd5(String ClusterCaMd5) {
        this.ClusterCaMd5 = ClusterCaMd5;
    }

    public ImageAssociatedContainer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageAssociatedContainer(ImageAssociatedContainer source) {
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.PodIp != null) {
            this.PodIp = new String(source.PodIp);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.OwnerAppId != null) {
            this.OwnerAppId = new Long(source.OwnerAppId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new String(source.ClusterStatus);
        }
        if (source.Cmd != null) {
            this.Cmd = new String(source.Cmd);
        }
        if (source.PodId != null) {
            this.PodId = new String(source.PodId);
        }
        if (source.ClusterCaMd5 != null) {
            this.ClusterCaMd5 = new String(source.ClusterCaMd5);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "PodIp", this.PodIp);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);
        this.setParamSimple(map, prefix + "PodId", this.PodId);
        this.setParamSimple(map, prefix + "ClusterCaMd5", this.ClusterCaMd5);

    }
}

