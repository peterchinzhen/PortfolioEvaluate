function y = pSharpe(r, rf)
% ����sharpe����
% ���룺
% r: ��ȯ��������[m��n]��n=20,120,250,500
% rf: �޷�������[1��1],�������Ϊһ���ڶ�������
% �����
% y: Sharpe����[m��1]

% �����޷�������ת�������޷�������
rf = rf/250;

[m,n]=size(r);
rf=rf*ones(m,n);

y=zeros(m,1);
% �����ȯ�Ĳ�����
std_r = std(r,0,2);

i=find(std_r==0);
y(i)=NaN;
i=find(std_r~=0);
if ~isempty(i)
  y(i) = (mean(r(i,:) - rf(i,:),2))./std_r(i);
end