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
    private static String endpoint = "tag.intl.tencentcloudapi.com";
    private static String service = "tag";
    private static String version = "2018-08-13";
    
    public TagClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TagClient(Credential credential, String region, ClientProfile profile) {
        super(TagClient.endpoint, TagClient.version, credential, region, profile);
    }

    /**
     *Creates a project
     * @param req AddProjectRequest
     * @return AddProjectResponse
     * @throws TencentCloudSDKException
     */
    public AddProjectResponse AddProject(AddProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddProject", AddProjectResponse.class);
    }

    /**
     *This API is used to associate resources with tags.
     * @param req AddResourceTagRequest
     * @return AddResourceTagResponse
     * @throws TencentCloudSDKException
     */
    public AddResourceTagResponse AddResourceTag(AddResourceTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddResourceTag", AddResourceTagResponse.class);
    }

    /**
     *This API is used to associate a tag with multiple resources.
     * @param req AttachResourcesTagRequest
     * @return AttachResourcesTagResponse
     * @throws TencentCloudSDKException
     */
    public AttachResourcesTagResponse AttachResourcesTag(AttachResourcesTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachResourcesTag", AttachResourcesTagResponse.class);
    }

    /**
     *This API is used to create a tag key and tag value pair.
     * @param req CreateTagRequest
     * @return CreateTagResponse
     * @throws TencentCloudSDKException
     */
    public CreateTagResponse CreateTag(CreateTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTag", CreateTagResponse.class);
    }

    /**
     *This API is used to create multiple tag key-value pairs.
     * @param req CreateTagsRequest
     * @return CreateTagsResponse
     * @throws TencentCloudSDKException
     */
    public CreateTagsResponse CreateTags(CreateTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTags", CreateTagsResponse.class);
    }

    /**
     *This API is used to unassociate tags and resources.
     * @param req DeleteResourceTagRequest
     * @return DeleteResourceTagResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceTagResponse DeleteResourceTag(DeleteResourceTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteResourceTag", DeleteResourceTagResponse.class);
    }

    /**
     *This API is used to delete a tag key and tag value pair.
     * @param req DeleteTagRequest
     * @return DeleteTagResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTagResponse DeleteTag(DeleteTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTag", DeleteTagResponse.class);
    }

    /**
     *This API is used to delete tag keys and tag values in batches.
     * @param req DeleteTagsRequest
     * @return DeleteTagsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTagsResponse DeleteTags(DeleteTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTags", DeleteTagsResponse.class);
    }

    /**
     *This API is used to get project lists.
     * @param req DescribeProjectsRequest
     * @return DescribeProjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectsResponse DescribeProjects(DescribeProjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjects", DescribeProjectsResponse.class);
    }

    /**
     *This API is used to query the tags associated with a resource.
     * @param req DescribeResourceTagsRequest
     * @return DescribeResourceTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceTagsResponse DescribeResourceTags(DescribeResourceTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceTags", DescribeResourceTagsResponse.class);
    }

    /**
     *This API is used to query the tag key-value pairs associated with an existing resource.
     * @param req DescribeResourceTagsByResourceIdsRequest
     * @return DescribeResourceTagsByResourceIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceTagsByResourceIdsResponse DescribeResourceTagsByResourceIds(DescribeResourceTagsByResourceIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceTagsByResourceIds", DescribeResourceTagsByResourceIdsResponse.class);
    }

    /**
     *This API is used to view the tags associated with a resource in sequence.
     * @param req DescribeResourceTagsByResourceIdsSeqRequest
     * @return DescribeResourceTagsByResourceIdsSeqResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceTagsByResourceIdsSeqResponse DescribeResourceTagsByResourceIdsSeq(DescribeResourceTagsByResourceIdsSeqRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceTagsByResourceIdsSeq", DescribeResourceTagsByResourceIdsSeqResponse.class);
    }

    /**
     *This API is used to get resource tags based on tag keys.
     * @param req DescribeResourceTagsByTagKeysRequest
     * @return DescribeResourceTagsByTagKeysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceTagsByTagKeysResponse DescribeResourceTagsByTagKeys(DescribeResourceTagsByTagKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceTagsByTagKeys", DescribeResourceTagsByTagKeysResponse.class);
    }

    /**
     *This API is used to query resources by tags.
     * @param req DescribeResourcesByTagsRequest
     * @return DescribeResourcesByTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcesByTagsResponse DescribeResourcesByTags(DescribeResourcesByTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourcesByTags", DescribeResourcesByTagsResponse.class);
    }

    /**
     *This API is used to query resource list by tags.
     * @param req DescribeResourcesByTagsUnionRequest
     * @return DescribeResourcesByTagsUnionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcesByTagsUnionResponse DescribeResourcesByTagsUnion(DescribeResourcesByTagsUnionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourcesByTagsUnion", DescribeResourcesByTagsUnionResponse.class);
    }

    /**
     *This API is used to query tag keys in the list of created tags.
     * @param req DescribeTagKeysRequest
     * @return DescribeTagKeysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagKeysResponse DescribeTagKeys(DescribeTagKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTagKeys", DescribeTagKeysResponse.class);
    }

    /**
     *This API is used to query tag values in an existing tag list.
     * @param req DescribeTagValuesRequest
     * @return DescribeTagValuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagValuesResponse DescribeTagValues(DescribeTagValuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTagValues", DescribeTagValuesResponse.class);
    }

    /**
     *This API is used to query tag values in a created tag list.
     * @param req DescribeTagValuesSeqRequest
     * @return DescribeTagValuesSeqResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagValuesSeqResponse DescribeTagValuesSeq(DescribeTagValuesSeqRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTagValuesSeq", DescribeTagValuesSeqResponse.class);
    }

    /**
     *This API is used to query the list of created tags.
     * @param req DescribeTagsRequest
     * @return DescribeTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagsResponse DescribeTags(DescribeTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTags", DescribeTagsResponse.class);
    }

    /**
     *This API is used to query the created tag lists.

     * @param req DescribeTagsSeqRequest
     * @return DescribeTagsSeqResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagsSeqResponse DescribeTagsSeq(DescribeTagsSeqRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTagsSeq", DescribeTagsSeqResponse.class);
    }

    /**
     *This API is used to unbind a tag from multiple resources.
     * @param req DetachResourcesTagRequest
     * @return DetachResourcesTagResponse
     * @throws TencentCloudSDKException
     */
    public DetachResourcesTagResponse DetachResourcesTag(DetachResourcesTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachResourcesTag", DetachResourcesTagResponse.class);
    }

    /**
     *This API is used to query the list of resources associated with a tag.
     * @param req GetResourcesRequest
     * @return GetResourcesResponse
     * @throws TencentCloudSDKException
     */
    public GetResourcesResponse GetResources(GetResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetResources", GetResourcesResponse.class);
    }

    /**
     *This API is used to query the list of tag keys.
     * @param req GetTagKeysRequest
     * @return GetTagKeysResponse
     * @throws TencentCloudSDKException
     */
    public GetTagKeysResponse GetTagKeys(GetTagKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTagKeys", GetTagKeysResponse.class);
    }

    /**
     *This API is used to query tag values in the list of created tags.
     * @param req GetTagValuesRequest
     * @return GetTagValuesResponse
     * @throws TencentCloudSDKException
     */
    public GetTagValuesResponse GetTagValues(GetTagValuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTagValues", GetTagValuesResponse.class);
    }

    /**
     *This API is used to get the list of created tags.
     * @param req GetTagsRequest
     * @return GetTagsResponse
     * @throws TencentCloudSDKException
     */
    public GetTagsResponse GetTags(GetTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTags", GetTagsResponse.class);
    }

    /**
     *This API is used to modify all tags associated with a resource.
     * @param req ModifyResourceTagsRequest
     * @return ModifyResourceTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourceTagsResponse ModifyResourceTags(ModifyResourceTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResourceTags", ModifyResourceTagsResponse.class);
    }

    /**
     *This API is used to modify the tag value corresponding to a tag key associated with multiple resources.
     * @param req ModifyResourcesTagValueRequest
     * @return ModifyResourcesTagValueResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourcesTagValueResponse ModifyResourcesTagValue(ModifyResourcesTagValueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResourcesTagValue", ModifyResourcesTagValueResponse.class);
    }

    /**
     *This API is used to create and bind a tag uniformly to multiple specified resources of multiple Tencent Cloud services.
     * @param req TagResourcesRequest
     * @return TagResourcesResponse
     * @throws TencentCloudSDKException
     */
    public TagResourcesResponse TagResources(TagResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TagResources", TagResourcesResponse.class);
    }

    /**
     *This API is used to unbind a tag uniformly from multiple specified resources of multiple Tencent Cloud services.
     * @param req UnTagResourcesRequest
     * @return UnTagResourcesResponse
     * @throws TencentCloudSDKException
     */
    public UnTagResourcesResponse UnTagResources(UnTagResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnTagResources", UnTagResourcesResponse.class);
    }

    /**
     *This API is used to modify the values of tags associated with a resource (the tag key does not change).
     * @param req UpdateResourceTagValueRequest
     * @return UpdateResourceTagValueResponse
     * @throws TencentCloudSDKException
     */
    public UpdateResourceTagValueResponse UpdateResourceTagValue(UpdateResourceTagValueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateResourceTagValue", UpdateResourceTagValueResponse.class);
    }

}
