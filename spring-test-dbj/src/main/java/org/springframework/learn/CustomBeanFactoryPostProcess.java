package org.springframework.learn;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author dbj
 */
@Component
public class CustomBeanFactoryPostProcess implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AbstractBeanDefinition beanDefinitionA = (AbstractBeanDefinition) beanFactory.getBeanDefinition("a");
		beanDefinitionA.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_NAME);

		AbstractBeanDefinition beanDefinitionB = (AbstractBeanDefinition) beanFactory.getBeanDefinition("b");
		beanDefinitionB.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_NAME);

		AbstractBeanDefinition beanDefinitionF = (AbstractBeanDefinition) beanFactory.getBeanDefinition("f");
		beanDefinitionF.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_CONSTRUCTOR);
	}
}
