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
package com.tencentcloudapi.tag.v20180813;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tag.v20180813.models.*;

public class TagClient extends AbstractClient{
    private static String endpoint = "tag.tencentcloudapi.com";
    private static String service = "tag";
    private static String version = "2018-08-13";

    public TagClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TagClient(Credential credential, String region, ClientProfile profile) {
        super(TagClient.endpoint, TagClient.version, credential, region, profile);
    }

    /**
     *This API is used to associate resources with tags.
     * @param req AddResourceTagRequest
     * @return AddResourceTagResponse
     * @throws TencentCloudSDKException
     */
    public AddResourceTagResponse AddResourceTag(AddResourceTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddResourceTagResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddResourceTagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddResourceTag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to associate a tag with multiple resources.
     * @param req AttachResourcesTagRequest
     * @return AttachResourcesTagResponse
     * @throws TencentCloudSDKException
     */
    public AttachResourcesTagResponse AttachResourcesTag(AttachResourcesTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachResourcesTagResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AttachResourcesTagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachResourcesTag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a tag key and tag value pair.
     * @param req CreateTagRequest
     * @return CreateTagResponse
     * @throws TencentCloudSDKException
     */
    public CreateTagResponse CreateTag(CreateTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTagResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create multiple tag key-value pairs.
     * @param req CreateTagsRequest
     * @return CreateTagsResponse
     * @throws TencentCloudSDKException
     */
    public CreateTagsResponse CreateTags(CreateTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to unassociate tags and resources.
     * @param req DeleteResourceTagRequest
     * @return DeleteResourceTagResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceTagResponse DeleteResourceTag(DeleteResourceTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteResourceTagResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteResourceTagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteResourceTag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a tag key and tag value pair.
     * @param req DeleteTagRequest
     * @return DeleteTagResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTagResponse DeleteTag(DeleteTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTagResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete multiple tag key-value pairs.
     * @param req DeleteTagsRequest
     * @return DeleteTagsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTagsResponse DeleteTags(DeleteTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the tags associated with a resource.
     * @param req DescribeResourceTagsRequest
     * @return DescribeResourceTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceTagsResponse DescribeResourceTags(DescribeResourceTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourceTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the tag key-value pairs associated with an existing resource.
     * @param req DescribeResourceTagsByResourceIdsRequest
     * @return DescribeResourceTagsByResourceIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceTagsByResourceIdsResponse DescribeResourceTagsByResourceIds(DescribeResourceTagsByResourceIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceTagsByResourceIdsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceTagsByResourceIdsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourceTagsByResourceIds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to view the tags associated with a resource in sequence.
     * @param req DescribeResourceTagsByResourceIdsSeqRequest
     * @return DescribeResourceTagsByResourceIdsSeqResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceTagsByResourceIdsSeqResponse DescribeResourceTagsByResourceIdsSeq(DescribeResourceTagsByResourceIdsSeqRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceTagsByResourceIdsSeqResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceTagsByResourceIdsSeqResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourceTagsByResourceIdsSeq");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get resource tags based on tag keys.
     * @param req DescribeResourceTagsByTagKeysRequest
     * @return DescribeResourceTagsByTagKeysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceTagsByTagKeysResponse DescribeResourceTagsByTagKeys(DescribeResourceTagsByTagKeysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceTagsByTagKeysResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceTagsByTagKeysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourceTagsByTagKeys");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query resources by tags.
     * @param req DescribeResourcesByTagsRequest
     * @return DescribeResourcesByTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcesByTagsResponse DescribeResourcesByTags(DescribeResourcesByTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourcesByTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourcesByTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourcesByTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query resource list by tags.
     * @param req DescribeResourcesByTagsUnionRequest
     * @return DescribeResourcesByTagsUnionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcesByTagsUnionResponse DescribeResourcesByTagsUnion(DescribeResourcesByTagsUnionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourcesByTagsUnionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourcesByTagsUnionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourcesByTagsUnion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query tag keys in an existing tag list.

     * @param req DescribeTagKeysRequest
     * @return DescribeTagKeysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagKeysResponse DescribeTagKeys(DescribeTagKeysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTagKeysResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTagKeysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTagKeys");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query tag values in an existing tag list.
     * @param req DescribeTagValuesRequest
     * @return DescribeTagValuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagValuesResponse DescribeTagValues(DescribeTagValuesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTagValuesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTagValuesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTagValues");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query tag values in a created tag list.
     * @param req DescribeTagValuesSeqRequest
     * @return DescribeTagValuesSeqResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagValuesSeqResponse DescribeTagValuesSeq(DescribeTagValuesSeqRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTagValuesSeqResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTagValuesSeqResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTagValuesSeq");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query existing tag lists.

     * @param req DescribeTagsRequest
     * @return DescribeTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagsResponse DescribeTags(DescribeTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the created tag lists.

     * @param req DescribeTagsSeqRequest
     * @return DescribeTagsSeqResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagsSeqResponse DescribeTagsSeq(DescribeTagsSeqRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTagsSeqResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTagsSeqResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTagsSeq");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to unbind a tag from multiple resources.
     * @param req DetachResourcesTagRequest
     * @return DetachResourcesTagResponse
     * @throws TencentCloudSDKException
     */
    public DetachResourcesTagResponse DetachResourcesTag(DetachResourcesTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachResourcesTagResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetachResourcesTagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachResourcesTag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of resources associated with a tag.
     * @param req GetResourcesRequest
     * @return GetResourcesResponse
     * @throws TencentCloudSDKException
     */
    public GetResourcesResponse GetResources(GetResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetResourcesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of tag keys.
     * @param req GetTagKeysRequest
     * @return GetTagKeysResponse
     * @throws TencentCloudSDKException
     */
    public GetTagKeysResponse GetTagKeys(GetTagKeysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetTagKeysResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetTagKeysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetTagKeys");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query tag values in the list of created tags.
     * @param req GetTagValuesRequest
     * @return GetTagValuesResponse
     * @throws TencentCloudSDKException
     */
    public GetTagValuesResponse GetTagValues(GetTagValuesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetTagValuesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetTagValuesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetTagValues");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of created tags.
     * @param req GetTagsRequest
     * @return GetTagsResponse
     * @throws TencentCloudSDKException
     */
    public GetTagsResponse GetTags(GetTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify all tags associated with a resource.
     * @param req ModifyResourceTagsRequest
     * @return ModifyResourceTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourceTagsResponse ModifyResourceTags(ModifyResourceTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyResourceTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyResourceTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyResourceTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the tag value corresponding to a tag key associated with multiple resources.
     * @param req ModifyResourcesTagValueRequest
     * @return ModifyResourcesTagValueResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourcesTagValueResponse ModifyResourcesTagValue(ModifyResourcesTagValueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyResourcesTagValueResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyResourcesTagValueResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyResourcesTagValue");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create and bind a tag uniformly to multiple specified resources of multiple Tencent Cloud services.
     * @param req TagResourcesRequest
     * @return TagResourcesResponse
     * @throws TencentCloudSDKException
     */
    public TagResourcesResponse TagResources(TagResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TagResourcesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TagResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TagResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to unbind a tag uniformly from multiple specified resources of multiple Tencent Cloud services.
     * @param req UnTagResourcesRequest
     * @return UnTagResourcesResponse
     * @throws TencentCloudSDKException
     */
    public UnTagResourcesResponse UnTagResources(UnTagResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnTagResourcesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnTagResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnTagResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the values of tags associated with a resource (the tag key does not change).
     * @param req UpdateResourceTagValueRequest
     * @return UpdateResourceTagValueResponse
     * @throws TencentCloudSDKException
     */
    public UpdateResourceTagValueResponse UpdateResourceTagValue(UpdateResourceTagValueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateResourceTagValueResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateResourceTagValueResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateResourceTagValue");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
